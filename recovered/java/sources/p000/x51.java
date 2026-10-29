            package p000;

            import com.google.android.gms.common.data.DataHolder;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x51 extends AbstractC1775j {

                /* JADX INFO: renamed from: b */
                public boolean f18956b;

                /* JADX INFO: renamed from: c */
                public ArrayList f18957c;

                public x51(DataHolder dataHolder) {
/* 1 */             super(dataHolder);
/* 5 */             this.f18956b = false;
                }

                /* JADX INFO: renamed from: c */
                public final int m9710c(int i) {
/* 1 */             if (i >= 0 && i < this.f18957c.size()) {
/* 19 */                return ((Integer) this.f18957c.get(i)).intValue();
                    }
/* 32 */            C1951n4.m6859j(AbstractC0886en.m3505i(i, "Position ", " is out of bounds for this buffer"));
/* 35 */            return 0;
                }

                /* JADX INFO: renamed from: f */
                public final void m9711f() {
                    synchronized (this) {
                        try {
/* 4 */                     if (!this.f18956b) {
/* 6 */                         DataHolder dataHolder = this.f11978a;
/* 8 */                         kb1.m6061n(dataHolder);
/* 11 */                        int i = dataHolder.f3470v;
/* 15 */                        ArrayList arrayList = new ArrayList();
/* 18 */                        this.f18957c = arrayList;
/* 21 */                        if (i > 0) {
/* 28 */                            arrayList.add(0);
/* 41 */                            String strM2015G1 = this.f11978a.m2015G1(0, this.f11978a.m2016H1(0), "external_leaderboard_id");
/* 46 */                            for (int i2 = 1; i2 < i; i2++) {
/* 50 */                                int iM2016H1 = this.f11978a.m2016H1(i2);
/* 56 */                                String strM2015G2 = this.f11978a.m2015G1(i2, iM2016H1, "external_leaderboard_id");
/* 60 */                                if (strM2015G2 == null) {
/* 122 */                                   throw new NullPointerException("Missing value for markerColumn: external_leaderboard_id, at row: " + i2 + ", for window: " + iM2016H1);
                                        }
/* 66 */                                if (!strM2015G2.equals(strM2015G1)) {
/* 74 */                                    this.f18957c.add(Integer.valueOf(i2));
/* 77 */                                    strM2015G1 = strM2015G2;
                                        }
                                    }
                                }
/* 123 */                       this.f18956b = true;
                            }
                        } catch (Throwable th) {
/* 128 */                   throw th;
                        }
                    }
                }

                @Override // p000.AbstractC1775j
                public final Object get(int i) {
                    int iIntValue;
                    int iIntValue2;
/* 1 */             m9711f();
/* 4 */             int iM9710c = m9710c(i);
/* 8 */             int i2 = 0;
/* 9 */             DataHolder dataHolder = this.f11978a;
/* 11 */            if (i >= 0 && i != this.f18957c.size()) {
/* 30 */                if (i == this.f18957c.size() - 1) {
/* 32 */                    kb1.m6061n(dataHolder);
/* 35 */                    iIntValue = dataHolder.f3470v;
/* 45 */                    iIntValue2 = ((Integer) this.f18957c.get(i)).intValue();
                        } else {
/* 61 */                    iIntValue = ((Integer) this.f18957c.get(i + 1)).intValue();
/* 73 */                    iIntValue2 = ((Integer) this.f18957c.get(i)).intValue();
                        }
/* 49 */                i2 = iIntValue - iIntValue2;
/* 79 */                if (i2 == 1) {
/* 81 */                    int iM9710c2 = m9710c(i);
/* 85 */                    kb1.m6061n(dataHolder);
/* 88 */                    dataHolder.m2016H1(iM9710c2);
/* 91 */                    i2 = 1;
                        }
                    }
/* 94 */            return new z51(dataHolder, iM9710c, i2);
                }

                @Override // p000.AbstractC1775j
                public final int getCount() {
/* 1 */             m9711f();
/* 6 */             return this.f18957c.size();
                }
            }
