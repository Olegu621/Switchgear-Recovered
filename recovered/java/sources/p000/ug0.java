            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import kotlin.collections.C1839a;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 125 */   public final class ug0 extends pg3 {

                /* JADX INFO: renamed from: U */
                public final Object f17515U;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ int f17516i = 1;

                /* JADX INFO: renamed from: v */
                public final Object f17517v;

                /* JADX INFO: renamed from: w */
                public final int f17518w;

                public ug0(Object obj, String str, dc0 dc0Var, int i) {
                    Collection collectionM6210b;
/* 4 */             obj.getClass();
/* 8 */             if (i == 0) {
/* 126 */               throw null;
                    }
/* 13 */            this.f17517v = obj;
/* 15 */            this.f17518w = i;
/* 40 */            C1898lp c1898lp = new C1898lp(str + " value: " + obj, 5);
/* 43 */            StackTraceElement[] stackTrace = c1898lp.getStackTrace();
/* 47 */            stackTrace.getClass();
/* 51 */            int length = stackTrace.length + (-2);
/* 53 */            length = length < 0 ? 0 : length;
/* 56 */            if (length < 0) {
/* 122 */               ds0.m3200q(AbstractC0886en.m3505i(length, "Requested element count ", " is less than zero."));
/* 125 */               throw null;
                    }
/* 58 */            if (length == 0) {
/* 60 */                collectionM6210b = nd0.f14189a;
                    } else {
/* 63 */                int length2 = stackTrace.length;
/* 64 */                if (length >= length2) {
/* 66 */                    collectionM6210b = C2103qd.m7779n(stackTrace);
                        } else if (length == 1) {
/* 77 */                    collectionM6210b = C1839a.m6210b(stackTrace[length2 - 1]);
                        } else {
/* 84 */                    ArrayList arrayList = new ArrayList(length);
/* 89 */                    for (int i2 = length2 - length; i2 < length2; i2++) {
/* 93 */                        arrayList.add(stackTrace[i2]);
                            }
/* 99 */                    collectionM6210b = arrayList;
                        }
                    }
/* 108 */           c1898lp.setStackTrace((StackTraceElement[]) collectionM6210b.toArray(new StackTraceElement[0]));
/* 111 */           this.f17515U = c1898lp;
                }

                @Override // p000.pg3
                /* JADX INFO: renamed from: b */
                public final Object mo7445b() throws C1898lp {
/* 1 */             int i = this.f17516i;
/* 3 */             Object obj = this.f17517v;
                    switch (i) {
                        case 0:
/* 11 */                    int iM3520y = AbstractC0886en.m3520y(this.f17518w);
/* 15 */                    if (iM3520y == 0) {
/* 40 */                        throw ((C1898lp) this.f17515U);
                            }
/* 18 */                    if (iM3520y == 1) {
/* 28 */                        obj.getClass();
/* 31 */                        obj.toString();
/* 34 */                        return null;
                            }
/* 21 */                    if (iM3520y == 2) {
/* 34 */                        return null;
                            }
/* 24 */                    ds0.m3187b();
/* 34 */                    return null;
                        default:
/* 8 */                     return obj;
                    }
                }

                @Override // p000.pg3
                /* JADX INFO: renamed from: v */
                public final pg3 mo7446v(String str, Function1 function1) {
                    switch (this.f17516i) {
                        case 0:
/* 33 */                    return this;
                        default:
/* 6 */                     Object obj = this.f17517v;
                            return ((Boolean) function1.invoke(obj)).booleanValue() ? this : new ug0(obj, str, (dc0) this.f17515U, this.f17518w);
                    }
                }

/* 126 */       public ug0(Object obj, int i, dc0 dc0Var) {
                    obj.getClass();
                    if (i != 0) {
/* 128 */               this.f17517v = obj;
/* 129 */               this.f17518w = i;
/* 130 */               this.f17515U = dc0Var;
                        return;
                    }
/* 131 */           throw null;
                }
            }
