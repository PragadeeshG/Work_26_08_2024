create table if not exists bank_accounts_and_features(
savings_acc varchar(255) not null,
current_acc varchar(255) null,
salary_acc varchar(255) null,
direct_invest_acc varchar(255) null,
safe_deposit_locker varchar(255) null,
safe_custody varchar(255) null,
national_pension_scheme varchar(255) null,
pension_disbursment_account varchar(255) null,
pmjdy varchar(255) null,
other_options varchar(255) null,
constraint bank_accounts_and_features_pk primary key(savings_acc));