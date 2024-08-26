create table if not exists bank_cards(
account_number Integer not null,
credit_cards varchar(255) null,
debit_cards varchar(255) null,
prepaid_cards varchar(255) null,
transit_cards varchar(255) null,
commercial_credit_cards varchar(255) null,
commercial_debit_cards varchar(255) null,
wallets_card varchar(255) null,
digital_paymnets varchar(255) null,
my_design_cutomization varchar(255) null,
credit_card_control_center varchar(255) null,
debit_card_control_center varchar(255) null,
forex_card varchar(255) null,
card_security_governance varchar(255) null,
constraint bank_cards_pk primary key(account_number));