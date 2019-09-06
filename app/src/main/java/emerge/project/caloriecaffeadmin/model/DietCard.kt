package emarge.project.caloriecaffe.model

class DietCard {


    var paymentCardCode: String? = null
    var paymentCardSerialNumber: String? = null
    var fullName: String? = null
    var dietPlanRequestStatus: Boolean? = null
    var dateStamp: String? = null


    constructor() {}


    constructor(
            cardCode: String?,
            cardSerialNumber: String?,
            name: String?,
            status: Boolean?,
            date: String?
    ) {
        this.paymentCardCode = cardCode
        this.paymentCardSerialNumber = cardSerialNumber
        this.fullName = name
        this.dietPlanRequestStatus = status
        this.dateStamp = date

    }
}