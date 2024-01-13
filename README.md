# آزمایش پنجم
علیرضا حیدری - حمیدرضا یعقوبی
## بخش یک و دو
ابتدا پروژه را مطابق روش گفته شده درست می کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/4eec3e71-0599-4f43-9bef-407c504d5ecd)
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/fe3df74b-b228-49f2-881c-f2a140f78b52)
حال موارد گفته شده را به فایل pom اضافه می کنیم.
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/8e65665a-46e5-484e-b3e1-9f1989b55524)
حال Maven Test راا اجرا می کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/64c3ea1e-7828-4ada-8af1-6ac455124163)
حال پکیج resources را درست می کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/4915c968-f4f2-4e19-b1c8-bccb1b43158b)
و کد جمع گفته شده را قرار می دهیم.
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/d61506d4-44a4-4f17-bbc6-d5dc516377d9)
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/b13feed2-4b03-4434-a94b-9f79cf1dc8dd)
حال Alt Enter
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/5066dec1-3912-4a3d-a35f-ab9e17bb08c7)
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/1953fefd-4e26-470b-a780-b9f7c07803de)
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/64221da9-eef3-4cbf-a3dd-eaaa615a9d0e)
و با موفقیت تست را ران می کنیم
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/594d601f-e2a5-4682-8f0a-5f812b5ca505)
و calculator.feature را ران می کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/a30e7e8d-cd37-456e-8a16-88e58cd01128)
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/cb9b0146-18a6-42c1-a98a-2afa9b58ace3)
همانطور که گفته شده بود، به مشکل بر می خوریم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/92ef24b6-ca5d-4a15-bf9e-2962539eb136)
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/fefcc196-cbc2-4c4f-b5fa-6b1bd4eb17b8)
حال فایل فیچر را تغییر می دهیم و ران می کنیم
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/a2237c3c-dfbd-4946-a614-2f7a8eec621b)
و به ارور می خوریم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/685479c1-431f-49ad-81a0-462d956f33ea)
یکم ور رفتیم و ارور درست رو پیدا کردیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/6149b64a-3c79-4d4e-95a9-483b80df2767)
ظاهرا مشکل از پیاده سازی Then است که باید درستش کنیم
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/7c40d1db-4776-4717-bd21-09632e5d8bfe)
در نهایت مشکلی که طبق تصویر زیر داریم این است که در رجکس مربوطه عدد منفی کنترل نمی شود:
![Screenshot from 2024-01-13 23-01-01](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/880fb8bd-d679-4b03-81b4-9d9550c27ec0)
برای حل آن چنین می کنیم (رجکس رو درست می کنیم):
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/7fd8f56b-8aa3-43ea-948f-952e71a97ad9)
و مشکلات مرتفع می شوند:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/637b252d-7212-43e3-8ae9-a489f34dc8ae)


## بخش سوم
برای این کار ابتدا تابع مورد نظر را در calculator اضافه می کنیم. مطابق شکل زیر:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/db50878e-2f3a-4584-94d8-869671259471)
سپس برای پارس کردن درست سناریو، کافیست مشابه قبل، بخش های زیر را اضافه کنیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/4369e372-9116-4d9d-aff8-33239656940d)
حال کافیست سناریوها را بنویسیم:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/6fea97fa-49fb-4cce-9dfa-54728ec5daf4)

سپس ران می کنیم و همه چیز اوکی است:
![image](https://github.com/hamidrezayaghobi/SEL_week5/assets/59170724/7732226a-43bf-4d47-92d1-a6d817c7e3e1)









