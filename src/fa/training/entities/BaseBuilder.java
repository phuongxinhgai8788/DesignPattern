package fa.training.entities;

public interface BaseBuilder {
	
	BaseBuilder setFirsName(String firstName);

    BaseBuilder setLastName(String lastName);

    BaseBuilder setBirthDate(String birthDate);

    BaseBuilder setAddress(String address);

    BaseBuilder setPhone(String phone);

    BaseBuilder setEmail(String email);

    String getFirsName();

    String getLastName();

    String getBirthDate();

    String getAddress();

    String getPhone();

    String getEmail();

    Candidate build();
}
