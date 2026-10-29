            package p000;

            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fb0 implements Comparable {

                /* JADX INFO: renamed from: b */
                public static final eb0 f8059b = new eb0(null);

                /* JADX INFO: renamed from: c */
                public static final long f8060c;

                /* JADX INFO: renamed from: d */
                public static final long f8061d;

                /* JADX INFO: renamed from: a */
                public final long f8062a;

                static {
/* 9 */             int i = gb0.f8530a;
/* 20 */            f8060c = mn0.m6693i(4611686018427387903L);
/* 31 */            f8061d = mn0.m6693i(-4611686018427387903L);
                }

                public /* synthetic */ fb0(long j) {
/* 4 */             this.f8062a = j;
                }

                /* JADX INFO: renamed from: a */
                public static final long m3685a(long j, long j2) {
/* 4 */             long j3 = j2 / 1000000;
/* 6 */             long j4 = j + j3;
/* 14 */            if (-4611686018426L > j4 || j4 >= 4611686018427L) {
/* 38 */                return mn0.m6693i(r02.m8045b(j4));
                    }
/* 29 */            return mn0.m6695k((j4 * 1000000) + (j2 - (j3 * 1000000)));
                }

                /* JADX INFO: renamed from: b */
                public static final void m3686b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
/* 1 */             sb.append(i);
/* 4 */             if (i2 != 0) {
/* 8 */                 sb.append('.');
/* 15 */                String strM6232H = StringsKt.m6232H(i3, String.valueOf(i2));
/* 23 */                int i4 = -1;
/* 24 */                int length = strM6232H.length() - 1;
/* 25 */                if (length >= 0) {
                            while (true) {
/* 27 */                        int i5 = length - 1;
/* 35 */                        if (strM6232H.charAt(length) != '0') {
/* 37 */                            i4 = length;
                                    break;
                                } else if (i5 < 0) {
                                    break;
                                } else {
/* 42 */                            length = i5;
                                }
                            }
                        }
/* 44 */                int i6 = i4 + 1;
/* 48 */                if (z || i6 >= 3) {
/* 59 */                    sb.append((CharSequence) strM6232H, 0, ((i4 + 3) / 3) * 3);
                        } else {
/* 52 */                    sb.append((CharSequence) strM6232H, 0, i6);
                        }
                    }
/* 62 */            sb.append(str);
                }

                /* JADX INFO: renamed from: c */
                public static int m3687c(long j, long j2) {
/* 1 */             long j3 = j ^ j2;
/* 8 */             if (j3 >= 0 && (((int) j3) & 1) != 0) {
/* 19 */                int i = (((int) j) & 1) - (((int) j2) & 1);
                        return j < 0 ? -i : i;
                    }
/* 29 */            if (j < j2) {
/* 31 */                return -1;
                    }
                    return j == j2 ? 0 : 1;
                }

                /* JADX INFO: renamed from: d */
                public static final int m3688d(long j) {
/* 5 */             if (m3690f(j)) {
/* 7 */                 return 0;
                    }
/* 22 */            return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % 1000) * 1000000 : (j >> 1) % 1000000000);
                }

                /* JADX INFO: renamed from: e */
                public static final ib0 m3689e(long j) {
                    return (((int) j) & 1) == 0 ? ib0.NANOSECONDS : ib0.MILLISECONDS;
                }

                /* JADX INFO: renamed from: f */
                public static final boolean m3690f(long j) {
                    return j == f8060c || j == f8061d;
                }

                /* JADX INFO: renamed from: g */
                public static final long m3691g(long j, long j2) {
/* 5 */             if (m3690f(j)) {
/* 11 */                if (!m3690f(j2) || (j2 ^ j) >= 0) {
/* 28 */                    return j;
                        }
/* 23 */                C1951n4.m6859j("Summing infinite durations of different signs yields an undefined result.");
/* 26 */                return 0L;
                    }
/* 33 */            if (m3690f(j2)) {
/* 35 */                return j2;
                    }
/* 38 */            int i = ((int) j) & 1;
/* 41 */            if (i != (((int) j2) & 1)) {
                        return i == 1 ? m3685a(j >> 1, j2 >> 1) : m3685a(j2 >> 1, j >> 1);
                    }
/* 45 */            long j3 = (j >> 1) + (j2 >> 1);
/* 46 */            if (i == 0) {
                        return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? mn0.m6693i(j3 / 1000000) : mn0.m6695k(j3);
                    }
/* 80 */            return mn0.m6694j(j3);
                }

                /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
                
                    if ((java.lang.Integer.signum(r21) * java.lang.Long.signum(r7)) > 0) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
                
                    if ((java.lang.Integer.signum(r21) * java.lang.Long.signum(r7)) > 0) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00cb, code lost:
                
                    return p000.fb0.f8060c;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
                
                    return p000.fb0.f8061d;
                 */
                /* JADX INFO: renamed from: h */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final long m3692h(int i, long j) {
/* 12 */            if (m3690f(j)) {
/* 14 */                if (i == 0) {
/* 33 */                    C1951n4.m6859j("Multiplying infinite duration by zero yields an undefined result.");
/* 10 */                    return 0L;
                        }
/* 16 */                if (i > 0) {
/* 3 */                     return j;
                        }
/* 27 */                long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
/* 28 */                int i2 = gb0.f8530a;
/* 30 */                return j2;
                    }
/* 37 */            if (i == 0) {
/* 10 */                return 0L;
                    }
/* 40 */            long j3 = j >> 1;
                    long j4 = i;
/* 43 */            long j5 = j3 * j4;
/* 57 */            if ((((int) j) & 1) == 0) {
/* 64 */                if (-2147483647L <= j3 && j3 < 2147483648L) {
/* 75 */                    return mn0.m6695k(j5);
                        }
/* 87 */                if (j5 / j4 == j3) {
                            return (-4611686018426999999L > j5 || j5 >= 4611686018427000000L) ? mn0.m6693i(j5 / 1000000) : mn0.m6695k(j5);
                        }
/* 118 */               long j6 = j3 / 1000000;
/* 124 */               long j7 = j6 * j4;
/* 131 */               long j8 = (((j3 - (j6 * 1000000)) * j4) / 1000000) + j7;
/* 137 */               if (j7 / j4 == j6 && (j8 ^ j7) >= 0) {
/* 154 */                   return mn0.m6693i(r02.m8046c(j8, new ra1(-4611686018427387903L, 4611686018427387903L)));
                        }
                    } else if (j5 / j4 == j3) {
/* 186 */               return mn0.m6693i(r02.m8046c(j5, new ra1(-4611686018427387903L, 4611686018427387903L)));
                    }
                }

                /* JADX INFO: renamed from: i */
                public static final double m3693i(long j, ib0 ib0Var) {
/* 5 */             if (j == f8060c) {
/* 7 */                 return Double.POSITIVE_INFINITY;
                    }
/* 14 */            if (j == f8061d) {
/* 16 */                return Double.NEGATIVE_INFINITY;
                    }
/* 27 */            return jb0.m5734a(j >> 1, m3689e(j), ib0Var);
                }

                /* JADX INFO: renamed from: j */
                public static final long m3694j(long j, ib0 ib0Var) {
/* 5 */             if (j == f8060c) {
/* 7 */                 return Long.MAX_VALUE;
                    }
/* 17 */            if (j == f8061d) {
/* 19 */                return Long.MIN_VALUE;
                    }
/* 33 */            return ib0Var.f9526a.convert(j >> 1, m3689e(j).f9526a);
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 7 */             return m3687c(this.f8062a, ((fb0) obj).f8062a);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof fb0) {
                        return this.f8062a == ((fb0) obj).f8062a;
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Long.hashCode(this.f8062a);
                }

                public final String toString() {
/* 1 */             long j = this.f8062a;
/* 7 */             if (j == 0) {
/* 9 */                 return "0s";
                    }
/* 16 */            if (j == f8060c) {
/* 18 */                return "Infinity";
                    }
/* 25 */            if (j == f8061d) {
/* 27 */                return "-Infinity";
                    }
/* 30 */            int i = 0;
/* 36 */            boolean z = j < 0;
/* 39 */            StringBuilder sb = new StringBuilder();
/* 42 */            if (z) {
/* 46 */                sb.append('-');
                    }
/* 49 */            if (j < 0) {
/* 59 */                j = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
/* 60 */                int i2 = gb0.f8530a;
                    }
/* 64 */            long jM3694j = m3694j(j, ib0.DAYS);
/* 85 */            int iM3694j = m3690f(j) ? 0 : (int) (m3694j(j, ib0.HOURS) % 24);
/* 103 */           int iM3694j2 = m3690f(j) ? 0 : (int) (m3694j(j, ib0.MINUTES) % 60);
/* 119 */           int iM3694j3 = m3690f(j) ? 0 : (int) (m3694j(j, ib0.SECONDS) % 60);
/* 120 */           int iM3688d = m3688d(j);
/* 130 */           boolean z2 = jM3694j != 0;
/* 135 */           boolean z3 = iM3694j != 0;
/* 140 */           boolean z4 = iM3694j2 != 0;
/* 148 */           boolean z5 = (iM3694j3 == 0 && iM3688d == 0) ? false : true;
/* 149 */           if (z2) {
/* 151 */               sb.append(jM3694j);
/* 156 */               sb.append('d');
/* 159 */               i = 1;
                    }
/* 162 */           if (z3 || (z2 && (z4 || z5))) {
/* 170 */               int i3 = i + 1;
/* 172 */               if (i > 0) {
/* 174 */                   sb.append(' ');
                        }
/* 177 */               sb.append(iM3694j);
/* 182 */               sb.append('h');
/* 185 */               i = i3;
                    }
/* 186 */           if (z4 || (z5 && (z3 || z2))) {
/* 194 */               int i4 = i + 1;
/* 196 */               if (i > 0) {
/* 198 */                   sb.append(' ');
                        }
/* 201 */               sb.append(iM3694j2);
/* 206 */               sb.append('m');
/* 209 */               i = i4;
                    }
/* 210 */           if (z5) {
/* 212 */               int i5 = i + 1;
/* 214 */               if (i > 0) {
/* 216 */                   sb.append(' ');
                        }
/* 219 */               if (iM3694j3 != 0 || z2 || z3 || z4) {
/* 277 */                   m3686b(sb, iM3694j3, iM3688d, 9, "s", false);
                        } else if (iM3688d >= 1000000) {
/* 242 */                   m3686b(sb, iM3688d / 1000000, iM3688d % 1000000, 6, "ms", false);
                        } else if (iM3688d >= 1000) {
/* 258 */                   m3686b(sb, iM3688d / 1000, iM3688d % 1000, 3, "us", false);
                        } else {
/* 262 */                   sb.append(iM3688d);
/* 267 */                   sb.append("ns");
                        }
/* 280 */               i = i5;
                    }
/* 281 */           if (z && i > 1) {
/* 293 */               sb.insert(1, '(').append(')');
                    }
/* 296 */           return sb.toString();
                }
            }
