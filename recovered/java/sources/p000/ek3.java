            package p000;

            import java.util.Date;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ek3 {

                /* JADX INFO: renamed from: a */
                public final Integer f7771a;

                /* JADX INFO: renamed from: b */
                public final Integer f7772b;

                /* JADX INFO: renamed from: c */
                public final Integer f7773c;

                /* JADX INFO: renamed from: d */
                public final Date f7774d;

                /* JADX INFO: renamed from: e */
                public final String f7775e;

                public ek3(Integer num, Integer num2, Integer num3, Date date, String str) {
/* 4 */             this.f7771a = num;
/* 6 */             this.f7772b = num2;
/* 8 */             this.f7773c = num3;
/* 10 */            this.f7774d = date;
/* 12 */            this.f7775e = str;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ek3) {
/* 10 */                ek3 ek3Var = (ek3) obj;
/* 12 */                Integer num = ek3Var.f7771a;
/* 14 */                Integer num2 = this.f7771a;
/* 16 */                if (num2 != null ? num2.equals(num) : num == null) {
/* 27 */                    Integer num3 = ek3Var.f7772b;
/* 29 */                    Integer num4 = this.f7772b;
/* 31 */                    if (num4 != null ? num4.equals(num3) : num3 == null) {
/* 42 */                        Integer num5 = ek3Var.f7773c;
/* 44 */                        Integer num6 = this.f7773c;
/* 46 */                        if (num6 != null ? num6.equals(num5) : num5 == null) {
/* 57 */                            Date date = ek3Var.f7774d;
/* 59 */                            Date date2 = this.f7774d;
/* 61 */                            if (date2 != null ? date2.equals(date) : date == null) {
/* 72 */                                String str = ek3Var.f7775e;
/* 74 */                                String str2 = this.f7775e;
/* 76 */                                if (str2 != null ? str2.equals(str) : str == null) {
/* 1 */                                     return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 2 */             Integer num = this.f7771a;
/* 8 */             int iHashCode = num == null ? 0 : num.hashCode();
/* 12 */            Integer num2 = this.f7772b;
/* 18 */            int iHashCode2 = num2 == null ? 0 : num2.hashCode();
/* 25 */            int i = iHashCode ^ 1000003;
/* 26 */            Integer num3 = this.f7773c;
/* 40 */            int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
/* 41 */            Date date = this.f7774d;
/* 52 */            int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
/* 53 */            String str = this.f7775e;
/* 62 */            return iHashCode4 ^ (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f7774d);
/* 11 */            StringBuilder sb = new StringBuilder("AgeSignalsResult{userStatus=");
/* 16 */            sb.append(this.f7771a);
/* 21 */            sb.append(", ageLower=");
/* 26 */            sb.append(this.f7772b);
/* 31 */            sb.append(", ageUpper=");
/* 36 */            sb.append(this.f7773c);
/* 41 */            sb.append(", mostRecentApprovalDate=");
/* 44 */            sb.append(strValueOf);
/* 49 */            sb.append(", installId=");
/* 56 */            return fm0.m3789o(sb, this.f7775e, "}");
                }
            }
