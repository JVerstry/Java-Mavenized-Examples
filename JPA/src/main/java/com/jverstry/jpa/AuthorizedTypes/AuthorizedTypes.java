
package com.jverstry.jpa.AuthorizedTypes;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class AuthorizedTypes implements Serializable {
	
	@Id
	private long id;
	
	// Primitives
	
	private boolean bool;
	private Boolean bool2;
	private byte byt;
	private Byte byt2;
	private char c;
	private Character c2;
	private double dou;
	private Double dou2;
	private float floa;
	private Float floa2;
	private int i;
	private Integer i2;
	private long l;
	private Long l2;
	private short sh;
	private Short sh2;
	
	// Serializable types
	
	private String str;
	private BigInteger bi;
	private BigDecimal bd;
	private Serializable userDefined;
	private byte[] ba;
	private Byte[] ba2; 
	private char[] ca;
	private Character[] ca2;

	public short getSh() {
		return sh;
	}

	public void setSh(short sh) {
		this.sh = sh;
	}

	public Short getSh2() {
		return sh2;
	}

	public void setSh2(Short sh2) {
		this.sh2 = sh2;
	}

	public enum Color { WHITE, BLACK, RED; }
	private Color col;
	
	// Other entities and embaddables

	@OneToOne
	private OtherEntity otherEntity;
	
	private SomeEmbeddable someEmbeddable;
	
//	@OneToMany
//	private Collection<SomeEmbeddable> coll;
//	@OneToMany
//    private Set<SomeEmbeddable> st;
//	@OneToMany
//    private List<SomeEmbeddable> list;
	
	@ElementCollection
    private Map<String, Serializable> mpp;
	
	// Time-related
	
	// Keeps date only
	@Temporal(TemporalType.DATE)
	private java.util.Date MyDate;

	// Keeps time only
	@Temporal(TemporalType.TIME)
	private java.util.Date MyTime;
	
	// Keeps date and time
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date MyTimestamp;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Calendar cal;

	// Keeps date only
	private java.sql.Date sqlDate;
	
	// Keeps time only
	private java.sql.Time sqlTime;
	
	// Keeps date and time
	private java.sql.Timestamp sqlTimeStamp;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isBool() {
		return bool;
	}

	public void setBool(boolean bool) {
		this.bool = bool;
	}

	public Boolean getBool2() {
		return bool2;
	}

	public void setBool2(Boolean bool2) {
		this.bool2 = bool2;
	}

	public byte getByt() {
		return byt;
	}

	public void setByt(byte byt) {
		this.byt = byt;
	}

	public Byte getByt2() {
		return byt2;
	}

	public void setByt2(Byte byt2) {
		this.byt2 = byt2;
	}

	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public Character getC2() {
		return c2;
	}

	public void setC2(Character c2) {
		this.c2 = c2;
	}

	public double getDou() {
		return dou;
	}

	public void setDou(double dou) {
		this.dou = dou;
	}

	public Double getDou2() {
		return dou2;
	}

	public void setDou2(Double dou2) {
		this.dou2 = dou2;
	}

	public float getFloa() {
		return floa;
	}

	public void setFloa(float floa) {
		this.floa = floa;
	}

	public Float getFloa2() {
		return floa2;
	}

	public void setFloa2(Float floa2) {
		this.floa2 = floa2;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Integer getI2() {
		return i2;
	}

	public void setI2(Integer i2) {
		this.i2 = i2;
	}

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}

	public Long getL2() {
		return l2;
	}

	public void setL2(Long l2) {
		this.l2 = l2;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public BigInteger getBi() {
		return bi;
	}

	public void setBi(BigInteger bi) {
		this.bi = bi;
	}

	public BigDecimal getBd() {
		return bd;
	}

	public void setBd(BigDecimal bd) {
		this.bd = bd;
	}

	public Serializable getUserDefined() {
		return userDefined;
	}

	public void setUserDefined(Serializable userDefined) {
		this.userDefined = userDefined;
	}

	public byte[] getBa() {
		return ba;
	}

	public void setBa(byte[] ba) {
		this.ba = ba;
	}

	public Byte[] getBa2() {
		return ba2;
	}

	public void setBa2(Byte[] ba2) {
		this.ba2 = ba2;
	}

	public char[] getCa() {
		return ca;
	}

	public void setCa(char[] ca) {
		this.ca = ca;
	}

	public Character[] getCa2() {
		return ca2;
	}

	public void setCa2(Character[] ca2) {
		this.ca2 = ca2;
	}

	public Color getCol() {
		return col;
	}

	public void setCol(Color col) {
		this.col = col;
	}

	public OtherEntity getOtherEntity() {
		return otherEntity;
	}

	public void setOtherEntity(OtherEntity otherEntity) {
		this.otherEntity = otherEntity;
	}

	public SomeEmbeddable getSomeEmbeddable() {
		return someEmbeddable;
	}

	public void setSomeEmbeddable(SomeEmbeddable someEmbeddable) {
		this.someEmbeddable = someEmbeddable;
	}

//	public Collection<SomeEmbeddable> getColl() {
//		return coll;
//	}
//
//	public void setColl(Collection<SomeEmbeddable> coll) {
//		this.coll = coll;
//	}
//
//	public Set<SomeEmbeddable> getSt() {
//		return st;
//	}
//
//	public void setSt(Set<SomeEmbeddable> st) {
//		this.st = st;
//	}
//
//	public List<SomeEmbeddable> getList() {
//		return list;
//	}
//
//	public void setList(List<SomeEmbeddable> list) {
//		this.list = list;
//	}

	public Map<String, Serializable> getMpp() {
		return mpp;
	}

	public void setMpp(Map<String, Serializable> mpp) {
		this.mpp = mpp;
	}

	public java.util.Date getMyDate() {
		return MyDate;
	}

	public void setMyDate(java.util.Date MyDate) {
		this.MyDate = MyDate;
	}

	public java.util.Date getMyTime() {
		return MyTime;
	}

	public void setMyTime(java.util.Date MyTime) {
		this.MyTime = MyTime;
	}

	public java.util.Date getMyTimestamp() {
		return MyTimestamp;
	}

	public void setMyTimestamp(java.util.Date MyTimestamp) {
		this.MyTimestamp = MyTimestamp;
	}

	public java.util.Calendar getCal() {
		return cal;
	}

	public void setCal(java.util.Calendar cal) {
		this.cal = cal;
	}

	public java.sql.Date getSqlDate() {
		return sqlDate;
	}

	public void setSqlDate(java.sql.Date sqlDate) {
		this.sqlDate = sqlDate;
	}

	public java.sql.Time getSqlTime() {
		return sqlTime;
	}

	public void setSqlTime(java.sql.Time sqlTime) {
		this.sqlTime = sqlTime;
	}

	public java.sql.Timestamp getSqlTimeStamp() {
		return sqlTimeStamp;
	}

	public void setSqlTimeStamp(java.sql.Timestamp sqlTimeStamp) {
		this.sqlTimeStamp = sqlTimeStamp;
	}

}
