package ca.utoronto.medicine.qa.learnerchart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "osce_pdf")
public class OscePdf {

    @Id
    @Column(name = "osce_name", columnDefinition = "VARCHAR")
    private String osceName;

    @JsonIgnore
    @Column(name = "osce_data", columnDefinition = "BLOB")
    private Blob osceData;

}
