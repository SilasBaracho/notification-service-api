/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.baracho.nm.infrastructure.config.kafka.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class NotificationAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1230906110111916640L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"NotificationAvro\",\"namespace\":\"br.com.baracho.nm.infrastructure.config.kafka.avro\",\"fields\":[{\"name\":\"notificationType\",\"type\":\"string\"},{\"name\":\"contactInfo\",\"type\":\"string\"},{\"name\":\"subject\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<NotificationAvro> ENCODER =
      new BinaryMessageEncoder<NotificationAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<NotificationAvro> DECODER =
      new BinaryMessageDecoder<NotificationAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<NotificationAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<NotificationAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<NotificationAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this NotificationAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a NotificationAvro from a ByteBuffer. */
  public static NotificationAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence notificationType;
  @Deprecated public java.lang.CharSequence contactInfo;
  @Deprecated public java.lang.CharSequence subject;
  @Deprecated public java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public NotificationAvro() {}

  /**
   * All-args constructor.
   * @param notificationType The new value for notificationType
   * @param contactInfo The new value for contactInfo
   * @param subject The new value for subject
   * @param message The new value for message
   */
  public NotificationAvro(java.lang.CharSequence notificationType, java.lang.CharSequence contactInfo, java.lang.CharSequence subject, java.lang.CharSequence message) {
    this.notificationType = notificationType;
    this.contactInfo = contactInfo;
    this.subject = subject;
    this.message = message;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return notificationType;
    case 1: return contactInfo;
    case 2: return subject;
    case 3: return message;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: notificationType = (java.lang.CharSequence)value$; break;
    case 1: contactInfo = (java.lang.CharSequence)value$; break;
    case 2: subject = (java.lang.CharSequence)value$; break;
    case 3: message = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'notificationType' field.
   * @return The value of the 'notificationType' field.
   */
  public java.lang.CharSequence getNotificationType() {
    return notificationType;
  }

  /**
   * Sets the value of the 'notificationType' field.
   * @param value the value to set.
   */
  public void setNotificationType(java.lang.CharSequence value) {
    this.notificationType = value;
  }

  /**
   * Gets the value of the 'contactInfo' field.
   * @return The value of the 'contactInfo' field.
   */
  public java.lang.CharSequence getContactInfo() {
    return contactInfo;
  }

  /**
   * Sets the value of the 'contactInfo' field.
   * @param value the value to set.
   */
  public void setContactInfo(java.lang.CharSequence value) {
    this.contactInfo = value;
  }

  /**
   * Gets the value of the 'subject' field.
   * @return The value of the 'subject' field.
   */
  public java.lang.CharSequence getSubject() {
    return subject;
  }

  /**
   * Sets the value of the 'subject' field.
   * @param value the value to set.
   */
  public void setSubject(java.lang.CharSequence value) {
    this.subject = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }

  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new NotificationAvro RecordBuilder.
   * @return A new NotificationAvro RecordBuilder
   */
  public static br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder newBuilder() {
    return new br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder();
  }

  /**
   * Creates a new NotificationAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new NotificationAvro RecordBuilder
   */
  public static br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder newBuilder(br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder other) {
    return new br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder(other);
  }

  /**
   * Creates a new NotificationAvro RecordBuilder by copying an existing NotificationAvro instance.
   * @param other The existing instance to copy.
   * @return A new NotificationAvro RecordBuilder
   */
  public static br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder newBuilder(br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro other) {
    return new br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder(other);
  }

  /**
   * RecordBuilder for NotificationAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<NotificationAvro>
    implements org.apache.avro.data.RecordBuilder<NotificationAvro> {

    private java.lang.CharSequence notificationType;
    private java.lang.CharSequence contactInfo;
    private java.lang.CharSequence subject;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.notificationType)) {
        this.notificationType = data().deepCopy(fields()[0].schema(), other.notificationType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contactInfo)) {
        this.contactInfo = data().deepCopy(fields()[1].schema(), other.contactInfo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subject)) {
        this.subject = data().deepCopy(fields()[2].schema(), other.subject);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.message)) {
        this.message = data().deepCopy(fields()[3].schema(), other.message);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing NotificationAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.notificationType)) {
        this.notificationType = data().deepCopy(fields()[0].schema(), other.notificationType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contactInfo)) {
        this.contactInfo = data().deepCopy(fields()[1].schema(), other.contactInfo);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.subject)) {
        this.subject = data().deepCopy(fields()[2].schema(), other.subject);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.message)) {
        this.message = data().deepCopy(fields()[3].schema(), other.message);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'notificationType' field.
      * @return The value.
      */
    public java.lang.CharSequence getNotificationType() {
      return notificationType;
    }

    /**
      * Sets the value of the 'notificationType' field.
      * @param value The value of 'notificationType'.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder setNotificationType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.notificationType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'notificationType' field has been set.
      * @return True if the 'notificationType' field has been set, false otherwise.
      */
    public boolean hasNotificationType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'notificationType' field.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder clearNotificationType() {
      notificationType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactInfo' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactInfo() {
      return contactInfo;
    }

    /**
      * Sets the value of the 'contactInfo' field.
      * @param value The value of 'contactInfo'.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder setContactInfo(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.contactInfo = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'contactInfo' field has been set.
      * @return True if the 'contactInfo' field has been set, false otherwise.
      */
    public boolean hasContactInfo() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'contactInfo' field.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder clearContactInfo() {
      contactInfo = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'subject' field.
      * @return The value.
      */
    public java.lang.CharSequence getSubject() {
      return subject;
    }

    /**
      * Sets the value of the 'subject' field.
      * @param value The value of 'subject'.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder setSubject(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.subject = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'subject' field has been set.
      * @return True if the 'subject' field has been set, false otherwise.
      */
    public boolean hasSubject() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'subject' field.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder clearSubject() {
      subject = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }

    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.message = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public br.com.baracho.nm.infrastructure.config.kafka.avro.NotificationAvro.Builder clearMessage() {
      message = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public NotificationAvro build() {
      try {
        NotificationAvro record = new NotificationAvro();
        record.notificationType = fieldSetFlags()[0] ? this.notificationType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.contactInfo = fieldSetFlags()[1] ? this.contactInfo : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.subject = fieldSetFlags()[2] ? this.subject : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.message = fieldSetFlags()[3] ? this.message : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<NotificationAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<NotificationAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<NotificationAvro>
    READER$ = (org.apache.avro.io.DatumReader<NotificationAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
