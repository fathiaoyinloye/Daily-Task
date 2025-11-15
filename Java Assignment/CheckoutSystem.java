java.util.ArratList;
public class CheckoutSystem{

	public static double totalPrice(ArrayList <Double> prices){
		int sum = 0;
		for(double price : prices){
			sum += price;
		}
		return sum;
	}
	public static double calculateVat(double sum){
		int vat =  (sum * 7.5)/100;
		return vat;

	}

	public static double calculateSumAfterVat(double sum, double vat){
		double totalPrice = sum + vat;
		return totalPrice;

	}


def calculate_sum_after_vat(sum, vat):
	




}


/*
def get_items(items):
	return items


def get_price(prices):
	return prices


	
def calculate_sum_after_vat(sum, vat):
	total_price = sum + vat;
	return total_price;


def calculate_balance(total, paid):
	return paid - total

def get_invoice(names, prices):
	total = total_price(prices)
	vat = calculate_vat(total)
	total_plus_vat = calculate_sum_after_vat(total, vat)
	count = 0
	print(">>>>>>>>>>>>>>>>> Reciept<<<<<<<<<<<<<<<<<<<")
	for price in prices:
		print(names[count], "		", prices[count])
		count += 1
	print("Subtotal is 	", total)
	print("VAT (7.5%)	 ", vat)
	print("Payment Amount 	",total_plus_vat )
	print(">>>>>>>>>>>>>>>>> Reciept<<<<<<<<<<<<<<<<<<<")

	return "Please Pay Payment Amount"



def get_receipt(names, prices, paid):
	total = total_price(prices)
	vat = calculate_vat(total)
	total_plus_vat = calculate_sum_after_vat(total, vat)
	balance = calculate_balance(total_plus_vat, paid)
	count = 0
	print(">>>>>>>>>>>>>>>>> Reciept<<<<<<<<<<<<<<<<<<<")
	for price in prices:
		print(names[count], "		", prices[count])
		count += 1
	print("Total Paid	 ", paid)
	print("Grand Total 	",total_plus_vat )
	print("Balance		", balance)
	print(">>>>>>>>>>>>>>>>> Reciept<<<<<<<<<<<<<<<<<<<")

	return "Payment successful! Thank You For Shopping"


	
	*/