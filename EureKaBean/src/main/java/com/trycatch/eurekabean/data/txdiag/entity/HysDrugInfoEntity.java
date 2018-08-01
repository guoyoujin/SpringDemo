package com.trycatch.eurekabean.data.txdiag.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.*;


@Table(name = "hys_drug_infos")
@Entity(name="com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity")
public class HysDrugInfoEntity extends BaseEntity{
    private static final long serialVersionUID= 21312431312312323L;
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private Long id;
    @Column(name="interior_code")
    private String         interiorCode;
    @Column(name="bar_code")
    private String         barCode;
    @Column(name="brand")
    private String         brand;
    @Column(name="goods_name")
    private String         goodsName;
    @Column(name="common_name")
    private String         commonName;
    @Column(name="english_or_pinyin")
    private String         englishOrPinyin;
    @Column(name="pinyin_code")
    private String         pinyinCode;
    @Lob
    @Column(name="brief",columnDefinition="TEXT",length = 65535)
    private String         brief;
    @Lob
    @Column(name="goods_details",columnDefinition="TEXT",length = 65535)
    private String         goodsDetails;
    @Lob
    @Column(name="goods_details_html",columnDefinition="TEXT",length = 65535)
    private String         goodsDetailsHtml;
    @Column(name="key_word")
    private String         keyWord;
    @Column(name="sf_hanma")
    private Integer         sfHanma;
    @Column(name="approval_document")
    private String         approvalDocument;
    @Lob
    @Column(name="specifications",columnDefinition="TEXT",length = 65535)
    private String         specifications;
    @Column(name="class_info")
    private String         classInfo;
    @Lob
    @Column(name="manufacturer",columnDefinition="TEXT",length = 65535)
    private String         manufacturer;
    @Column(name="production_address")
    private String         productionAddress;
    @Column(name="valid")
    private String         valid;
    @Column(name="net_weight")
    private String         netWeight;
    @Lob
    @Column(name="adverse_drug_reactions",columnDefinition="TEXT",length = 65535)
    private String         adverseDrugReactions;
    @Column(name="standard")
    private String         standard;
    @Column(name="storage")
    private String         storage;
    @Column(name="syrq")
    private String         syrq;
    @Lob
    @Column(name="taboo",columnDefinition="TEXT",length = 65535)
    private String         taboo;
    @Column(name="tare")
    private String         tare;
    @Lob
    @Column(name="treatment",columnDefinition="TEXT",length = 65535)
    private String         treatment;
    @Column(name="tsrqyy")
    private String         tsrqyy;
    @Lob
    @Column(name="usage_and_dosage",columnDefinition="TEXT",length = 65535)
    private String         usageAndDosage;
    @Lob
    @Column(name="tcac",columnDefinition="TEXT",length = 65535)
    private String         tcac;
    @Lob
    @Column(name="interactions",columnDefinition="TEXT",length = 65535)
    private String         interactions;
    @Lob
    @Column(name="indication",columnDefinition="TEXT",length = 65535)
    private String         indication;
    @Lob
    @Column(name="ingredients",columnDefinition="TEXT",length = 65535)
    private String         ingredients;
    @Column(name="purpose")
    private String         purpose;
    @Column(name="scope_of_application")
    private String         scopeOfApplication;
    @Column(name="shnl")
    private String         shnl;
    @Column(name="notes")
    private String         notes;
    @Column(name="overdose")
    private String         overdose;
    @Lob
    @Column(name="pharmacological",columnDefinition="TEXT",length = 65535)
    private String         pharmacological;
    @Column(name="method_of_use")
    private String         methodOfUse;
    @Lob
    @Column(name="pic_text_details_html",columnDefinition="TEXT",length = 16777215)
    private String         picTextDetailsHtml;
    @Column(name="price")
    private Double         price;
    @Column(name="packing_size")
    private String         packingSize;
    @Column(name="small_units")
    private String         smallUnits;
    @Column(name="smalles_unit")
    private String         smallesUnit;
    @Column(name="xbsl")
    private String         xbsl;
    @Column(name="zbsl")
    private String         zbsl;
    @Column(name="dbsl")
    private String         dbsl;
    @Column(name="prescription_type")
    private String         prescriptionType;
    @Column(name="repertory_count")
    private Integer         repertoryCount;
    @Column(name="sales_status")
    private Integer         salesStatus;
    @Column(name="if_accesories")
    private Integer         ifAccesories;
    @Column(name="bsyrq")
    private String         bsyrq;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getInteriorCode() {
        return interiorCode;
    }

    public void setInteriorCode(String interiorCode) {
        this.interiorCode = interiorCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getEnglishOrPinyin() {
        return englishOrPinyin;
    }

    public void setEnglishOrPinyin(String englishOrPinyin) {
        this.englishOrPinyin = englishOrPinyin;
    }

    public String getPinyinCode() {
        return pinyinCode;
    }

    public void setPinyinCode(String pinyinCode) {
        this.pinyinCode = pinyinCode;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getGoodsDetailsHtml() {
        return goodsDetailsHtml;
    }

    public void setGoodsDetailsHtml(String goodsDetailsHtml) {
        this.goodsDetailsHtml = goodsDetailsHtml;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getSfHanma() {
        return sfHanma;
    }

    public void setSfHanma(Integer sfHanma) {
        this.sfHanma = sfHanma;
    }

    public String getApprovalDocument() {
        return approvalDocument;
    }

    public void setApprovalDocument(String approvalDocument) {
        this.approvalDocument = approvalDocument;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductionAddress() {
        return productionAddress;
    }

    public void setProductionAddress(String productionAddress) {
        this.productionAddress = productionAddress;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public String getAdverseDrugReactions() {
        return adverseDrugReactions;
    }

    public void setAdverseDrugReactions(String adverseDrugReactions) {
        this.adverseDrugReactions = adverseDrugReactions;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getSyrq() {
        return syrq;
    }

    public void setSyrq(String syrq) {
        this.syrq = syrq;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    public String getTare() {
        return tare;
    }

    public void setTare(String tare) {
        this.tare = tare;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTsrqyy() {
        return tsrqyy;
    }

    public void setTsrqyy(String tsrqyy) {
        this.tsrqyy = tsrqyy;
    }

    public String getUsageAndDosage() {
        return usageAndDosage;
    }

    public void setUsageAndDosage(String usageAndDosage) {
        this.usageAndDosage = usageAndDosage;
    }

    public String getTcac() {
        return tcac;
    }

    public void setTcac(String tcac) {
        this.tcac = tcac;
    }

    public String getInteractions() {
        return interactions;
    }

    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getScopeOfApplication() {
        return scopeOfApplication;
    }

    public void setScopeOfApplication(String scopeOfApplication) {
        this.scopeOfApplication = scopeOfApplication;
    }

    public String getShnl() {
        return shnl;
    }

    public void setShnl(String shnl) {
        this.shnl = shnl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOverdose() {
        return overdose;
    }

    public void setOverdose(String overdose) {
        this.overdose = overdose;
    }

    public String getPharmacological() {
        return pharmacological;
    }

    public void setPharmacological(String pharmacological) {
        this.pharmacological = pharmacological;
    }

    public String getMethodOfUse() {
        return methodOfUse;
    }

    public void setMethodOfUse(String methodOfUse) {
        this.methodOfUse = methodOfUse;
    }

    public String getPicTextDetailsHtml() {
        return picTextDetailsHtml;
    }

    public void setPicTextDetailsHtml(String picTextDetailsHtml) {
        this.picTextDetailsHtml = picTextDetailsHtml;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPackingSize() {
        return packingSize;
    }

    public void setPackingSize(String packingSize) {
        this.packingSize = packingSize;
    }

    public String getSmallUnits() {
        return smallUnits;
    }

    public void setSmallUnits(String smallUnits) {
        this.smallUnits = smallUnits;
    }

    public String getSmallesUnit() {
        return smallesUnit;
    }

    public void setSmallesUnit(String smallesUnit) {
        this.smallesUnit = smallesUnit;
    }

    public String getXbsl() {
        return xbsl;
    }

    public void setXbsl(String xbsl) {
        this.xbsl = xbsl;
    }

    public String getZbsl() {
        return zbsl;
    }

    public void setZbsl(String zbsl) {
        this.zbsl = zbsl;
    }

    public String getDbsl() {
        return dbsl;
    }

    public void setDbsl(String dbsl) {
        this.dbsl = dbsl;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    public Integer getRepertoryCount() {
        return repertoryCount;
    }

    public void setRepertoryCount(Integer repertoryCount) {
        this.repertoryCount = repertoryCount;
    }

    public Integer getSalesStatus() {
        return salesStatus;
    }

    public void setSalesStatus(Integer salesStatus) {
        this.salesStatus = salesStatus;
    }

    public Integer getIfAccesories() {
        return ifAccesories;
    }

    public void setIfAccesories(Integer ifAccesories) {
        this.ifAccesories = ifAccesories;
    }

    public String getBsyrq() {
        return bsyrq;
    }

    public void setBsyrq(String bsyrq) {
        this.bsyrq = bsyrq;
    }

    @Override
    public String toString() {
        return "HysDrugInfoEntity{" +
                "id='" + id + '\'' +
                ", interiorCode='" + interiorCode + '\'' +
                ", barCode='" + barCode + '\'' +
                ", brand='" + brand + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", commonName='" + commonName + '\'' +
                ", englishOrPinyin='" + englishOrPinyin + '\'' +
                ", pinyinCode='" + pinyinCode + '\'' +
                ", brief='" + brief + '\'' +
                ", goodsDetails='" + goodsDetails + '\'' +
                ", goodsDetailsHtml='" + goodsDetailsHtml + '\'' +
                ", keyWord='" + keyWord + '\'' +
                ", sfHanma='" + sfHanma + '\'' +
                ", approvalDocument='" + approvalDocument + '\'' +
                ", specifications='" + specifications + '\'' +
                ", classInfo='" + classInfo + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionAddress='" + productionAddress + '\'' +
                ", valid='" + valid + '\'' +
                ", netWeight='" + netWeight + '\'' +
                ", adverseDrugReactions='" + adverseDrugReactions + '\'' +
                ", standard='" + standard + '\'' +
                ", storage='" + storage + '\'' +
                ", syrq='" + syrq + '\'' +
                ", taboo='" + taboo + '\'' +
                ", tare='" + tare + '\'' +
                ", treatment='" + treatment + '\'' +
                ", tsrqyy='" + tsrqyy + '\'' +
                ", usageAndDosage='" + usageAndDosage + '\'' +
                ", tcac='" + tcac + '\'' +
                ", interactions='" + interactions + '\'' +
                ", indication='" + indication + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", purpose='" + purpose + '\'' +
                ", scopeOfApplication='" + scopeOfApplication + '\'' +
                ", shnl='" + shnl + '\'' +
                ", notes='" + notes + '\'' +
                ", overdose='" + overdose + '\'' +
                ", pharmacological='" + pharmacological + '\'' +
                ", methodOfUse='" + methodOfUse + '\'' +
                ", picTextDetailsHtml='" + picTextDetailsHtml + '\'' +
                ", price='" + price + '\'' +
                ", packingSize='" + packingSize + '\'' +
                ", smallUnits='" + smallUnits + '\'' +
                ", smallesUnit='" + smallesUnit + '\'' +
                ", xbsl='" + xbsl + '\'' +
                ", zbsl='" + zbsl + '\'' +
                ", dbsl='" + dbsl + '\'' +
                ", prescriptionType='" + prescriptionType + '\'' +
                ", repertoryCount='" + repertoryCount + '\'' +
                ", salesStatus='" + salesStatus + '\'' +
                ", ifAccesories='" + ifAccesories + '\'' +
                ", bsyrq='" + bsyrq + '\'' +
                '}';
    }
}
