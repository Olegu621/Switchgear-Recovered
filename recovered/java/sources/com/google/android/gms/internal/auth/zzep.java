            package com.google.android.gms.internal.auth;

            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    final class zzep {
                private static final zzep zzb = new zzep(true);
                final zzgu zza = new zzgk(16);
                private boolean zzc;
                private boolean zzd;

                private zzep(boolean z) {
/* 12 */            zzb();
/* 15 */            zzb();
                }

                public static zzep zza() {
/* 2 */             throw null;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                private static final void zzd(zzeo zzeoVar, Object obj) {
                    boolean z;
/* 1 */             zzeoVar.zzb();
/* 5 */             zzez.zze(obj);
/* 8 */             zzhn zzhnVar = zzhn.zza;
/* 10 */            zzho zzhoVar = zzho.INT;
                    switch (r0.zza()) {
                        case INT:
/* 66 */                    z = obj instanceof Integer;
/* 68 */                    if (z) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case LONG:
/* 63 */                    z = obj instanceof Long;
/* 68 */                    if (z) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case FLOAT:
/* 60 */                    z = obj instanceof Float;
/* 68 */                    if (z) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case DOUBLE:
/* 57 */                    z = obj instanceof Double;
/* 68 */                    if (z) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case BOOLEAN:
/* 54 */                    z = obj instanceof Boolean;
/* 68 */                    if (z) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case STRING:
/* 51 */                    z = obj instanceof String;
/* 68 */                    if (z) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case BYTE_STRING:
/* 44 */                    if ((obj instanceof zzee) || (obj instanceof byte[])) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case ENUM:
/* 35 */                    if ((obj instanceof Integer) || (obj instanceof zzew)) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        case MESSAGE:
/* 26 */                    if ((obj instanceof zzfw) || (obj instanceof zzfb)) {
                            }
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                        default:
/* 101 */                   C1697u2.m5437m("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()});
                            break;
                    }
                }

                public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
                    zzgu zzguVar;
/* 3 */             zzep zzepVar = new zzep();
/* 6 */             int i = 0;
                    while (true) {
/* 9 */                 int iZzb = this.zza.zzb();
/* 13 */                zzguVar = this.zza;
/* 15 */                if (i >= iZzb) {
                            break;
                        }
/* 17 */                Map.Entry entryZzg = zzguVar.zzg(i);
/* 31 */                zzepVar.zzc((zzeo) entryZzg.getKey(), entryZzg.getValue());
/* 34 */                i++;
                    }
/* 49 */            for (Map.Entry entry : zzguVar.zzc()) {
/* 67 */                zzepVar.zzc((zzeo) entry.getKey(), entry.getValue());
                    }
/* 73 */            zzepVar.zzd = this.zzd;
/* 75 */            return zzepVar;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof zzep) {
/* 17 */                return this.zza.equals(((zzep) obj).zza);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.zza.hashCode();
                }

                public final void zzb() {
/* 3 */             if (this.zzc) {
/* 5 */                 return;
                    }
/* 8 */             this.zza.zza();
/* 12 */            this.zzc = true;
                }

                public final void zzc(zzeo zzeoVar, Object obj) {
/* 5 */             if (!zzeoVar.zzc()) {
/* 46 */                zzd(zzeoVar, obj);
                    } else {
/* 9 */                 if (!(obj instanceof List)) {
/* 42 */                    C1951n4.m6859j("Wrong object type used with protocol message reflection.");
/* 45 */                    return;
                        }
/* 13 */                ArrayList arrayList = new ArrayList();
/* 18 */                arrayList.addAll((List) obj);
/* 21 */                int size = arrayList.size();
/* 26 */                for (int i = 0; i < size; i++) {
/* 32 */                    zzd(zzeoVar, arrayList.get(i));
                        }
/* 38 */                obj = arrayList;
                    }
/* 51 */            if (obj instanceof zzfb) {
/* 54 */                this.zzd = true;
                    }
/* 58 */            this.zza.put(zzeoVar, obj);
                }

/* 18 */        private zzep() {
                }
            }
