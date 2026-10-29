            package com.google.android.gms.internal.drive;

            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    final class zzmp implements Comparable, Map.Entry {
                private Object value;
                private final /* synthetic */ zzmi zzvk;
                private final Comparable zzvn;

                public zzmp(zzmi zzmiVar, Map.Entry entry) {
/* 11 */            this(zzmiVar, (Comparable) entry.getKey(), entry.getValue());
                }

                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(Object obj) {
/* 15 */            return ((Comparable) getKey()).compareTo((Comparable) ((zzmp) obj).getKey());
                }

                @Override // java.util.Map.Entry
                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof Map.Entry)) {
/* 7 */                 return false;
                    }
/* 11 */            Map.Entry entry = (Map.Entry) obj;
                    return equals(this.zzvn, entry.getKey()) && equals(this.value, entry.getValue());
                }

                @Override // java.util.Map.Entry
                public final /* synthetic */ Object getKey() {
/* 1 */             return this.zzvn;
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 1 */             return this.value;
                }

                @Override // java.util.Map.Entry
                public final int hashCode() {
/* 1 */             Comparable comparable = this.zzvn;
/* 8 */             int iHashCode = comparable == null ? 0 : comparable.hashCode();
/* 12 */            Object obj = this.value;
/* 21 */            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 118 */           this.zzvk.zzeu();
/* 6 */             Object obj2 = this.value;
/* 8 */             this.value = obj;
/* 10 */            return obj2;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.zzvn);
/* 9 */             String strValueOf2 = String.valueOf(this.value);
/* 26 */            StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
/* 29 */            sb.append(strValueOf);
/* 34 */            sb.append("=");
/* 37 */            sb.append(strValueOf2);
/* 40 */            return sb.toString();
                }

/* 14 */        public zzmp(zzmi zzmiVar, Comparable comparable, Object obj) {
/* 15 */            this.zzvk = zzmiVar;
/* 16 */            this.zzvn = comparable;
/* 17 */            this.value = obj;
                }

/* 38 */        private static boolean equals(Object obj, Object obj2) {
                    if (obj == null) {
                        return obj2 == null;
                    }
/* 39 */            return obj.equals(obj2);
                }
            }
