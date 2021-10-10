package com.salah.tryjsondatabasedatatype;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "test_json")
@NoArgsConstructor
@Setter
@Getter
@ToString
@TypeDef(name = "json", typeClass = JsonType.class)
public class TestJSONModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Type(type = "json")
    @Column(name = "val", columnDefinition = "jsonb")
    private Map<String, String> val = new HashMap<>();
}
