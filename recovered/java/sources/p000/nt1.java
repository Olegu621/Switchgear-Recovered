            package p000;

            import androidx.core.app.NotificationCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public class nt1 {

                /* JADX INFO: renamed from: a */
                public final Object[] f14448a;

                /* JADX INFO: renamed from: b */
                public int f14449b;

                public nt1(int i) {
/* 4 */             if (i > 0) {
/* 8 */                 this.f14448a = new Object[i];
                    } else {
/* 13 */                C1951n4.m6859j("The max pool size must be > 0");
/* 17 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public Object mo7042a() {
/* 1 */             int i = this.f14449b;
/* 4 */             if (i <= 0) {
/* 3 */                 return null;
                    }
/* 6 */             int i2 = i - 1;
/* 8 */             Object[] objArr = this.f14448a;
/* 10 */            Object obj = objArr[i2];
/* 12 */            obj.getClass();
/* 15 */            objArr[i2] = null;
/* 21 */            this.f14449b--;
/* 23 */            return obj;
                }

                /* JADX INFO: renamed from: b */
                public void m7043b(C1789jd c1789jd) {
/* 1 */             int i = this.f14449b;
/* 3 */             Object[] objArr = this.f14448a;
/* 6 */             if (i < objArr.length) {
/* 8 */                 objArr[i] = c1789jd;
/* 12 */                this.f14449b = i + 1;
                    }
                }

                /* JADX INFO: renamed from: c */
                public boolean mo7044c(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             int i = this.f14449b;
/* 7 */             int i2 = 0;
                    while (true) {
/* 8 */                 Object[] objArr = this.f14448a;
/* 10 */                if (i2 >= i) {
/* 25 */                    int i3 = this.f14449b;
/* 28 */                    if (i3 >= objArr.length) {
/* 6 */                         return false;
                            }
/* 30 */                    objArr[i3] = obj;
/* 34 */                    this.f14449b = i3 + 1;
/* 32 */                    return true;
                        }
/* 14 */                if (objArr[i2] == obj) {
/* 21 */                    f42.m3656l("Already in the pool!");
/* 6 */                     return false;
                        }
/* 16 */                i2++;
                    }
                }

/* 17 */        public nt1() {
/* 19 */            this.f14448a = new Object[NotificationCompat.FLAG_LOCAL_ONLY];
                }
            }
