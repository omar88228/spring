package it.immobile.entity;
import java.io.Serializable;
import javax.persistence.*;
import it.immobile.enumeration.Type;

@Entity
@Table(name = "IMMOBILE")

public class Immobile implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IMMOBILE_ID")
	private int id;

	@Column(name = "SURFACE")
	private int surface;

	@Column(name = "LOCAL_NUMBER")
	private int localNumber;

	@Enumerated(EnumType.STRING)
	private Type type;

	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;

	public Immobile() {
		super();
	}

	public Immobile(int surface, int localNumber, String type, Address address) {
		super();
		this.surface = surface;
		this.localNumber = localNumber;
		this.type = Type.valueOf(type.toUpperCase());
		this.address = address;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

	public int getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(int localNumber) {
		this.localNumber = localNumber;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Immobile [id=" + id + ", surface=" + surface + ", localNumber=" + localNumber + ", type=" + type
				+ ", address=" + address + "]";
	}

}
