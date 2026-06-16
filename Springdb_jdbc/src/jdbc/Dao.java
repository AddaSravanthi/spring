package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Dao {
	private JdbcTemplate template;

	
	public Dao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dao(JdbcTemplate template) {
		super();
		this.template = template;
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public String saveData(Product p)
	{
		
		String qry = "insert into product values(?,?,?)";
		template.update(qry,p.getPid(),p.getPname(),p.getPrice());
		return "Row created";
	}
	public List<Product> getData()
	{
		String qry="select * from product";
		return template.query(qry,new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Product pd=new Product();
				pd.setPid(rs.getInt(1));
				pd.setPname(rs.getString(2));
				pd.setPrice(rs.getDouble(3));
				return pd;
			}
		});
	}
	public String Updatedata(Product p)
	{
		String qry="update product set pname=?,price=?  where pid=?";
		int r=template.update(qry,p.getPname(),p.getPrice(),p.getPid());
		if(r>0)
		{
			return "updated succesfully";
		}
		else
		{
			return "product not found";
		}
	}
	public String deleteData(int pid)
	{
	    String qry = "delete from product where pid=?";

	    int r = template.update(qry, pid);

	    if(r > 0)
	    {
	        return "Deleted Successfully";
	    }
	    else
	    {
	        return "Product Not Found";
	    }
	}

}
