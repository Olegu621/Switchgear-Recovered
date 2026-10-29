            package p000;

            import android.net.ConnectivityManager;
            import android.net.NetworkInfo;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzaa;
            import com.google.android.gms.internal.measurement.zzfh;
            import com.google.android.gms.internal.measurement.zzfl;
            import com.google.android.gms.internal.measurement.zzfn;
            import com.google.android.gms.internal.measurement.zzfr;
            import com.google.android.gms.internal.measurement.zzha;
            import com.google.android.gms.internal.measurement.zzhe;
            import com.google.android.gms.internal.measurement.zzhg;
            import com.google.android.gms.internal.measurement.zzhl;
            import com.google.android.gms.internal.measurement.zzho;
            import com.google.android.gms.internal.measurement.zzhq;
            import com.google.android.gms.internal.measurement.zzhr;
            import com.google.android.gms.internal.measurement.zzhs;
            import com.google.android.gms.internal.measurement.zzhv;
            import com.google.android.gms.internal.measurement.zzhw;
            import com.google.android.gms.internal.measurement.zzib;
            import com.google.android.gms.internal.measurement.zzic;
            import com.google.android.gms.internal.measurement.zzid;
            import com.google.android.gms.internal.measurement.zzii;
            import com.google.android.gms.internal.measurement.zzik;
            import com.google.android.gms.internal.measurement.zzis;
            import com.google.android.gms.internal.measurement.zzit;
            import com.google.android.gms.internal.measurement.zziu;
            import com.google.android.gms.internal.measurement.zzlq;
            import com.google.android.gms.internal.measurement.zzma;
            import com.google.android.gms.internal.measurement.zznk;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.measurement.zzqu;
            import com.google.android.gms.measurement.internal.zzbe;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzog;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.Serializable;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.security.MessageDigest;
            import java.util.ArrayList;
            import java.util.BitSet;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.zip.GZIPOutputStream;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ci3 extends wo3 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f2930d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ci3(mp3 mp3Var, int i) {
/* 3 */             super(mp3Var);
/* 1 */             this.f2930d = i;
                }

                /* JADX INFO: renamed from: D */
                public static zzbg m1657D(zzaa zzaaVar) {
                    Object obj;
/* 6 */             Bundle bundleM1658E = m1658E(zzaaVar.zzf(), true);
/* 30 */            String string = (!bundleM1658E.containsKey("_o") || (obj = bundleM1658E.get("_o")) == null) ? "app" : obj.toString();
/* 41 */            String strM7889V = qj3.m7889V(zzaaVar.zzb(), i13.f9403f, i13.f9405h);
/* 45 */            if (strM7889V == null) {
/* 47 */                strM7889V = zzaaVar.zzb();
                    }
/* 63 */            return new zzbg(strM7889V, new zzbe(bundleM1658E), string, zzaaVar.zza());
                }

                /* JADX INFO: renamed from: E */
                public static Bundle m1658E(Map map, boolean z) {
/* 3 */             Bundle bundle = new Bundle();
/* 18 */            for (String str : map.keySet()) {
/* 26 */                Object obj = map.get(str);
/* 30 */                if (obj == null) {
/* 33 */                    bundle.putString(str, null);
                        } else if (obj instanceof Long) {
/* 47 */                    bundle.putLong(str, ((Long) obj).longValue());
                        } else if (obj instanceof Double) {
/* 61 */                    bundle.putDouble(str, ((Double) obj).doubleValue());
                        } else if (!(obj instanceof ArrayList)) {
/* 118 */                   bundle.putString(str, obj.toString());
                        } else if (z) {
/* 71 */                    ArrayList arrayList = (ArrayList) obj;
/* 75 */                    ArrayList arrayList2 = new ArrayList();
/* 78 */                    int size = arrayList.size();
/* 84 */                    for (int i = 0; i < size; i++) {
/* 96 */                        arrayList2.add(m1658E((Map) arrayList.get(i), false));
                            }
/* 110 */                   bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                        }
                    }
/* 122 */           return bundle;
                }

                /* JADX INFO: renamed from: F */
                public static final void m1659F(zzhr zzhrVar, String str, Long l) {
/* 1 */             List listZza = zzhrVar.zza();
/* 5 */             int i = 0;
                    while (true) {
/* 10 */                if (i >= listZza.size()) {
/* 32 */                    i = -1;
                            break;
                        } else if (str.equals(((zzhw) listZza.get(i)).zzb())) {
                            break;
                        } else {
/* 29 */                    i++;
                        }
                    }
/* 33 */            zzhv zzhvVarZzn = zzhw.zzn();
/* 37 */            zzhvVarZzn.zzb(str);
/* 44 */            zzhvVarZzn.zzf(l.longValue());
/* 47 */            if (i >= 0) {
/* 49 */                zzhrVar.zze(i, zzhvVarZzn);
                    } else {
/* 53 */                zzhrVar.zzg(zzhvVarZzn);
                    }
                }

                /* JADX INFO: renamed from: G */
                public static final Bundle m1660G(List list) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                zzhw zzhwVar = (zzhw) it.next();
/* 22 */                String strZzb = zzhwVar.zzb();
/* 30 */                if (zzhwVar.zzi()) {
/* 36 */                    bundle.putDouble(strZzb, zzhwVar.zzj());
                        } else if (zzhwVar.zzg()) {
/* 50 */                    bundle.putFloat(strZzb, zzhwVar.zzh());
                        } else if (zzhwVar.zzc()) {
/* 64 */                    bundle.putString(strZzb, zzhwVar.zzd());
                        } else if (zzhwVar.zze()) {
/* 78 */                    bundle.putLong(strZzb, zzhwVar.zzf());
                        }
                    }
/* 82 */            return bundle;
                }

                /* JADX INFO: renamed from: H */
                public static final zzhw m1661H(zzhs zzhsVar, String str) {
/* 13 */            for (zzhw zzhwVar : zzhsVar.zza()) {
/* 29 */                if (zzhwVar.zzb().equals(str)) {
/* 31 */                    return zzhwVar;
                        }
                    }
/* 32 */            return null;
                }

                /* JADX INFO: renamed from: I */
                public static final Serializable m1662I(zzhs zzhsVar, String str) {
/* 1 */             zzhw zzhwVarM1661H = m1661H(zzhsVar, str);
/* 5 */             if (zzhwVarM1661H == null) {
/* 7 */                 return null;
                    }
/* 9 */             return m1666O(zzhwVarM1661H);
                }

                /* JADX INFO: renamed from: L */
                public static final void m1663L(int i, StringBuilder sb) {
/* 2 */             for (int i2 = 0; i2 < i; i2++) {
/* 6 */                 sb.append("  ");
                    }
                }

                /* JADX INFO: renamed from: M */
                public static final void m1664M(Uri.Builder builder, String str, String str2, Set set) {
/* 5 */             if (set.contains(str) || TextUtils.isEmpty(str2)) {
/* 17 */                return;
                    }
/* 14 */            builder.appendQueryParameter(str, str2);
                }

                /* JADX INFO: renamed from: N */
                public static final String m1665N(boolean z, boolean z2, boolean z3) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             if (z) {
/* 10 */                sb.append("Dynamic ");
                    }
/* 13 */            if (z2) {
/* 17 */                sb.append("Sequence ");
                    }
/* 20 */            if (z3) {
/* 24 */                sb.append("Session-Scoped ");
                    }
/* 27 */            return sb.toString();
                }

                /* JADX WARN: Type inference failed for: r2v3, types: [android.os.Bundle[], java.io.Serializable] */
                /* JADX INFO: renamed from: O */
                public static final Serializable m1666O(zzhw zzhwVar) {
/* 5 */             if (zzhwVar.zzc()) {
/* 7 */                 return zzhwVar.zzd();
                    }
/* 16 */            if (zzhwVar.zze()) {
/* 22 */                return Long.valueOf(zzhwVar.zzf());
                    }
/* 31 */            if (zzhwVar.zzi()) {
/* 37 */                return Double.valueOf(zzhwVar.zzj());
                    }
/* 46 */            if (zzhwVar.zzm() > 0) {
/* 52 */                return m1679o0(zzhwVar.zzk());
                    }
/* 57 */            return null;
                }

                /* JADX INFO: renamed from: P */
                public static final void m1667P(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
/* 4 */             for (String str : strArr) {
/* 10 */                String[] strArrSplit = str.split(",");
/* 14 */                String str2 = strArrSplit[0];
/* 19 */                String str3 = strArrSplit[strArrSplit.length - 1];
/* 21 */                String string = bundle.getString(str2);
/* 25 */                if (string != null) {
/* 27 */                    m1664M(builder, str3, string, set);
                        }
                    }
                }

                /* JADX INFO: renamed from: Q */
                public static final void m1668Q(StringBuilder sb, String str, zzii zziiVar) {
/* 1 */             if (zziiVar == null) {
/* 3 */                 return;
                    }
/* 5 */             m1663L(3, sb);
/* 8 */             sb.append(str);
/* 13 */            sb.append(" {\n");
/* 26 */            if (zziiVar.zzd() != 0) {
/* 28 */                m1663L(4, sb);
/* 33 */                sb.append("results: ");
/* 44 */                int i = 0;
/* 49 */                for (Long l : zziiVar.zzc()) {
/* 57 */                    int i2 = i + 1;
/* 59 */                    if (i != 0) {
/* 61 */                        sb.append(", ");
                            }
/* 64 */                    sb.append(l);
/* 67 */                    i = i2;
                        }
/* 69 */                sb.append('\n');
                    }
/* 76 */            if (zziiVar.zzb() != 0) {
/* 78 */                m1663L(4, sb);
/* 83 */                sb.append("status: ");
/* 94 */                int i3 = 0;
/* 99 */                for (Long l2 : zziiVar.zza()) {
/* 107 */                   int i4 = i3 + 1;
/* 109 */                   if (i3 != 0) {
/* 111 */                       sb.append(", ");
                            }
/* 114 */                   sb.append(l2);
/* 117 */                   i3 = i4;
                        }
/* 119 */               sb.append('\n');
                    }
/* 129 */           if (zziiVar.zzf() != 0) {
/* 131 */               m1663L(4, sb);
/* 136 */               sb.append("dynamic_filter_timestamps: {");
/* 147 */               int i5 = 0;
/* 152 */               for (zzhq zzhqVar : zziiVar.zze()) {
/* 160 */                   int i6 = i5 + 1;
/* 162 */                   if (i5 != 0) {
/* 164 */                       sb.append(", ");
                            }
/* 183 */                   sb.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
/* 188 */                   sb.append(":");
/* 207 */                   sb.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
/* 210 */                   i5 = i6;
                        }
/* 212 */               sb.append("}\n");
                    }
/* 219 */           if (zziiVar.zzh() != 0) {
/* 221 */               m1663L(4, sb);
/* 226 */               sb.append("sequence_filter_timestamps: {");
/* 237 */               int i7 = 0;
/* 242 */               for (zzik zzikVar : zziiVar.zzg()) {
/* 250 */                   int i8 = i7 + 1;
/* 252 */                   if (i7 != 0) {
/* 254 */                       sb.append(", ");
                            }
/* 273 */                   sb.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
/* 278 */                   sb.append(": [");
/* 285 */                   Iterator it = zzikVar.zzc().iterator();
/* 289 */                   int i9 = 0;
/* 294 */                   while (it.hasNext()) {
/* 302 */                       long jLongValue = ((Long) it.next()).longValue();
/* 306 */                       int i10 = i9 + 1;
/* 308 */                       if (i9 != 0) {
/* 310 */                           sb.append(", ");
                                }
/* 313 */                       sb.append(jLongValue);
/* 316 */                       i9 = i10;
                            }
/* 320 */                   sb.append("]");
/* 323 */                   i7 = i8;
                        }
/* 325 */               sb.append("}\n");
                    }
/* 328 */           m1663L(3, sb);
/* 331 */           sb.append("}\n");
                }

                /* JADX INFO: renamed from: R */
                public static final void m1669R(StringBuilder sb, int i, String str, Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return;
                    }
/* 6 */             m1663L(i + 1, sb);
/* 9 */             sb.append(str);
/* 14 */            sb.append(": ");
/* 17 */            sb.append(obj);
/* 22 */            sb.append('\n');
                }

                /* JADX INFO: renamed from: S */
                public static final void m1670S(StringBuilder sb, int i, String str, zzfl zzflVar) {
                    String str2;
/* 1 */             if (zzflVar == null) {
/* 3 */                 return;
                    }
/* 4 */             m1663L(i, sb);
/* 7 */             sb.append(str);
/* 12 */            sb.append(" {\n");
/* 19 */            if (zzflVar.zza()) {
/* 21 */                int iZzm = zzflVar.zzm();
/* 26 */                if (iZzm == 1) {
/* 49 */                    str2 = "UNKNOWN_COMPARISON_TYPE";
                        } else if (iZzm == 2) {
/* 46 */                    str2 = "LESS_THAN";
                        } else if (iZzm != 3) {
/* 40 */                    str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
                        } else {
/* 43 */                    str2 = "GREATER_THAN";
                        }
/* 53 */                m1669R(sb, i, "comparison_type", str2);
                    }
/* 60 */            if (zzflVar.zzb()) {
/* 72 */                m1669R(sb, i, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
                    }
/* 79 */            if (zzflVar.zzd()) {
/* 87 */                m1669R(sb, i, "comparison_value", zzflVar.zze());
                    }
/* 94 */            if (zzflVar.zzf()) {
/* 102 */               m1669R(sb, i, "min_comparison_value", zzflVar.zzg());
                    }
/* 109 */           if (zzflVar.zzh()) {
/* 117 */               m1669R(sb, i, "max_comparison_value", zzflVar.zzi());
                    }
/* 120 */           m1663L(i, sb);
/* 125 */           sb.append("}\n");
                }

                /* JADX INFO: renamed from: U */
                private final void m1671U() {
                }

                /* JADX INFO: renamed from: V */
                private final void m1672V() {
                }

                /* JADX INFO: renamed from: W */
                private final void m1673W() {
                }

                /* JADX INFO: renamed from: f0 */
                public static boolean m1674f0(String str) {
                    return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
                }

                /* JADX INFO: renamed from: g0 */
                public static boolean m1675g0(int i, List list) {
/* 7 */             if (i < list.size() * 64) {
                        return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
                    }
/* 36 */            return false;
                }

                /* JADX INFO: renamed from: h0 */
                public static ArrayList m1676h0(BitSet bitSet) {
/* 11 */            int length = (bitSet.length() + 63) / 64;
/* 12 */            ArrayList arrayList = new ArrayList(length);
/* 17 */            for (int i = 0; i < length; i++) {
/* 19 */                long j = 0;
/* 22 */                for (int i2 = 0; i2 < 64; i2++) {
/* 30 */                    int i3 = (i * 64) + i2;
/* 31 */                    if (i3 >= bitSet.length()) {
                                break;
                            }
/* 38 */                    if (bitSet.get(i3)) {
/* 43 */                        j |= 1 << i2;
                            }
                        }
/* 51 */                arrayList.add(Long.valueOf(j));
                    }
/* 57 */            return arrayList;
                }

                /* JADX INFO: renamed from: m0 */
                public static zznk m1677m0(zzma zzmaVar, byte[] bArr) {
/* 1 */             zzlq zzlqVarZza = zzlq.zza();
                    return zzlqVarZza != null ? zzmaVar.zzaV(bArr, zzlqVarZza) : zzmaVar.zzaW(bArr);
                }

                /* JADX INFO: renamed from: n0 */
                public static int m1678n0(zzic zzicVar, String str) {
/* 6 */             for (int i = 0; i < zzicVar.zzl(); i++) {
/* 20 */                if (str.equals(zzicVar.zzm(i).zzc())) {
/* 22 */                    return i;
                        }
                    }
/* 26 */            return -1;
                }

                /* JADX INFO: renamed from: o0 */
                public static Bundle[] m1679o0(List list) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Iterator it = list.iterator();
/* 14 */            while (it.hasNext()) {
/* 20 */                zzhw zzhwVar = (zzhw) it.next();
/* 22 */                if (zzhwVar != null) {
/* 26 */                    Bundle bundle = new Bundle();
/* 41 */                    for (zzhw zzhwVar2 : zzhwVar.zzk()) {
/* 53 */                        if (zzhwVar2.zzc()) {
/* 63 */                            bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                                } else if (zzhwVar2.zze()) {
/* 81 */                            bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                                } else if (zzhwVar2.zzi()) {
/* 99 */                            bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzj());
                                }
                            }
/* 107 */                   if (!bundle.isEmpty()) {
/* 109 */                       arrayList.add(bundle);
                            }
                        }
                    }
/* 123 */           return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
                }

                /* JADX INFO: renamed from: p0 */
                public static HashMap m1680p0(Bundle bundle, boolean z) {
/* 3 */             HashMap map = new HashMap();
/* 18 */            for (String str : bundle.keySet()) {
/* 26 */                Object obj = bundle.get(str);
/* 30 */                boolean z2 = obj instanceof Parcelable[];
/* 32 */                if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
/* 49 */                    if (z) {
/* 53 */                        ArrayList arrayList = new ArrayList();
/* 57 */                        if (z2) {
/* 63 */                            for (Parcelable parcelable : (Parcelable[]) obj) {
/* 69 */                                if (parcelable instanceof Bundle) {
/* 77 */                                    arrayList.add(m1680p0((Bundle) parcelable, false));
                                        }
                                    }
                                } else if (obj instanceof ArrayList) {
/* 87 */                            ArrayList arrayList2 = (ArrayList) obj;
/* 89 */                            int size = arrayList2.size();
/* 94 */                            for (int i = 0; i < size; i++) {
/* 96 */                                Object obj2 = arrayList2.get(i);
/* 102 */                               if (obj2 instanceof Bundle) {
/* 110 */                                   arrayList.add(m1680p0((Bundle) obj2, false));
                                        }
                                    }
                                } else if (obj instanceof Bundle) {
/* 126 */                           arrayList.add(m1680p0((Bundle) obj, false));
                                }
/* 129 */                       map.put(str, arrayList);
                            }
                        } else if (obj != null) {
/* 45 */                    map.put(str, obj);
                        }
                    }
/* 133 */           return map;
                }

                @Override // p000.wo3
                /* JADX INFO: renamed from: C */
                public final void mo216C() {
/* 1 */             int i = this.f2930d;
                }

                /* JADX INFO: renamed from: J */
                public void m1681J(StringBuilder sb, int i, List list) {
/* 1 */             if (list == null) {
/* 141 */               return;
                    }
/* 5 */             int i2 = i + 1;
/* 7 */             Iterator it = list.iterator();
/* 15 */            while (it.hasNext()) {
/* 21 */                zzhw zzhwVar = (zzhw) it.next();
/* 23 */                if (zzhwVar != null) {
/* 25 */                    m1663L(i2, sb);
/* 30 */                    sb.append("param {\n");
/* 58 */                    m1669R(sb, i2, "name", zzhwVar.zza() ? ((ij3) this.f16749a).f9639U.m6657b(zzhwVar.zzb()) : null);
/* 75 */                    m1669R(sb, i2, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
/* 96 */                    m1669R(sb, i2, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
/* 115 */                   m1669R(sb, i2, "double_value", zzhwVar.zzi() ? Double.valueOf(zzhwVar.zzj()) : null);
/* 122 */                   if (zzhwVar.zzm() > 0) {
/* 128 */                       m1681J(sb, i2, zzhwVar.zzk());
                            }
/* 131 */                   m1663L(i2, sb);
/* 136 */                   sb.append("}\n");
                        }
                    }
                }

                /* JADX INFO: renamed from: K */
                public void m1682K(StringBuilder sb, int i, zzfh zzfhVar) {
                    String str;
/* 1 */             if (zzfhVar == null) {
/* 3 */                 return;
                    }
/* 4 */             m1663L(i, sb);
/* 9 */             sb.append("filter {\n");
/* 16 */            if (zzfhVar.zze()) {
/* 28 */                m1669R(sb, i, "complement", Boolean.valueOf(zzfhVar.zzf()));
                    }
/* 35 */            if (zzfhVar.zzg()) {
/* 53 */                m1669R(sb, i, "param_name", ((ij3) this.f16749a).f9639U.m6657b(zzfhVar.zzh()));
                    }
/* 62 */            if (zzfhVar.zza()) {
/* 64 */                int i2 = i + 1;
/* 66 */                zzfr zzfrVarZzb = zzfhVar.zzb();
/* 70 */                if (zzfrVarZzb != null) {
/* 74 */                    m1663L(i2, sb);
/* 79 */                    sb.append("string_filter {\n");
/* 86 */                    if (zzfrVarZzb.zza()) {
                                switch (zzfrVarZzb.zzj()) {
                                    case 1:
/* 113 */                               str = "UNKNOWN_MATCH_TYPE";
                                        break;
                                    case 2:
/* 110 */                               str = "REGEXP";
                                        break;
                                    case 3:
/* 107 */                               str = "BEGINS_WITH";
                                        break;
                                    case 4:
/* 104 */                               str = "ENDS_WITH";
                                        break;
                                    case 5:
/* 101 */                               str = "PARTIAL";
                                        break;
                                    case 6:
/* 98 */                                str = "EXACT";
                                        break;
                                    default:
/* 95 */                                str = "IN_LIST";
                                        break;
                                }
/* 117 */                       m1669R(sb, i2, "match_type", str);
                            }
/* 124 */                   if (zzfrVarZzb.zzb()) {
/* 132 */                       m1669R(sb, i2, "expression", zzfrVarZzb.zzc());
                            }
/* 139 */                   if (zzfrVarZzb.zzd()) {
/* 151 */                       m1669R(sb, i2, "case_sensitive", Boolean.valueOf(zzfrVarZzb.zze()));
                            }
/* 158 */                   if (zzfrVarZzb.zzg() > 0) {
/* 162 */                       m1663L(i + 2, sb);
/* 167 */                       sb.append("expression_list {\n");
/* 182 */                       for (String str2 : zzfrVarZzb.zzf()) {
/* 192 */                           m1663L(i + 3, sb);
/* 195 */                           sb.append(str2);
/* 200 */                           sb.append("\n");
                                }
/* 204 */                       sb.append("}\n");
                            }
/* 207 */                   m1663L(i2, sb);
/* 210 */                   sb.append("}\n");
                        }
                    }
/* 217 */           if (zzfhVar.zzc()) {
/* 227 */               m1670S(sb, i + 1, "number_filter", zzfhVar.zzd());
                    }
/* 230 */           m1663L(i, sb);
/* 233 */           sb.append("}\n");
                }

                /* JADX INFO: renamed from: T */
                public boolean m1683T() {
/* 1 */             m9593A();
/* 16 */            ConnectivityManager connectivityManager = (ConnectivityManager) ((ij3) this.f16749a).f9645a.getSystemService("connectivity");
/* 18 */            NetworkInfo activeNetworkInfo = null;
/* 19 */            if (connectivityManager != null) {
                        try {
/* 21 */                    activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        } catch (SecurityException unused) {
                        }
                    }
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }

                /* JADX INFO: renamed from: X */
                public void m1684X(zzit zzitVar, Object obj) {
/* 1 */             kb1.m6061n(obj);
/* 4 */             zzitVar.zzd();
/* 7 */             zzitVar.zzf();
/* 10 */            zzitVar.zzh();
/* 15 */            if (obj instanceof String) {
/* 19 */                zzitVar.zzc((String) obj);
/* 22 */                return;
                    }
/* 25 */            if (obj instanceof Long) {
/* 33 */                zzitVar.zze(((Long) obj).longValue());
                    } else {
/* 39 */                if (obj instanceof Double) {
/* 47 */                    zzitVar.zzg(((Double) obj).doubleValue());
/* 50 */                    return;
                        }
/* 55 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 57 */                ij3.m4555l(uh3Var);
/* 64 */                uh3Var.f17538f.m8511b(obj, "Ignoring invalid (type) user attribute value");
                    }
                }

                /* JADX INFO: renamed from: Y */
                public void m1685Y(String str, xo3 xo3Var, zzib zzibVar, yh3 yh3Var) {
                    String str2;
/* 1 */             String str3 = xo3Var.f19297a;
/* 5 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             mo1375y();
/* 10 */            m9593A();
                    try {
/* 18 */                URL url = new URI(str3).toURL();
/* 24 */                this.f15676b.m6761i0();
/* 27 */                byte[] bArrZzcc = zzibVar.zzcc();
/* 31 */                bj3 bj3Var = ij3Var.f9659i;
/* 33 */                ij3.m4555l(bj3Var);
/* 38 */                Map map = xo3Var.f19298b;
/* 40 */                if (map == null) {
/* 42 */                    map = Collections.EMPTY_MAP;
                        }
/* 45 */                str2 = str;
                        try {
/* 51 */                    bj3Var.m1373L(new eu0(this, str2, url, bArrZzcc, map, yh3Var));
                        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
/* 56 */                    uh3 uh3Var = ij3Var.f9655f;
/* 58 */                    ij3.m4555l(uh3Var);
/* 69 */                    uh3Var.f17538f.m8512c(uh3.m9013H(str2), "Failed to parse URL. Not uploading MeasurementBatch. appId", str3);
                        }
                    } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
/* 55 */                str2 = str;
                    }
                }

                /* JADX INFO: renamed from: Z */
                public void m1686Z(zzhv zzhvVar, Object obj) {
/* 1 */             zzhvVar.zze();
/* 4 */             zzhvVar.zzg();
/* 7 */             zzhvVar.zzi();
/* 10 */            zzhvVar.zzm();
/* 15 */            if (obj instanceof String) {
/* 19 */                zzhvVar.zzd((String) obj);
/* 22 */                return;
                    }
/* 25 */            if (obj instanceof Long) {
/* 33 */                zzhvVar.zzf(((Long) obj).longValue());
/* 36 */                return;
                    }
/* 39 */            if (obj instanceof Double) {
/* 47 */                zzhvVar.zzh(((Double) obj).doubleValue());
/* 50 */                return;
                    }
/* 53 */            if (!(obj instanceof Bundle[])) {
/* 173 */               uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 175 */               ij3.m4555l(uh3Var);
/* 182 */               uh3Var.f17538f.m8511b(obj, "Ignoring invalid (type) event param value");
/* 185 */               return;
                    }
/* 59 */            ArrayList arrayList = new ArrayList();
/* 64 */            for (Bundle bundle : (Bundle[]) obj) {
/* 68 */                if (bundle != null) {
/* 71 */                    zzhv zzhvVarZzn = zzhw.zzn();
/* 87 */                    for (String str : bundle.keySet()) {
/* 95 */                        zzhv zzhvVarZzn2 = zzhw.zzn();
/* 99 */                        zzhvVarZzn2.zzb(str);
/* 102 */                       Object obj2 = bundle.get(str);
/* 108 */                       if (obj2 instanceof Long) {
/* 116 */                           zzhvVarZzn2.zzf(((Long) obj2).longValue());
                                } else if (obj2 instanceof String) {
/* 126 */                           zzhvVarZzn2.zzd((String) obj2);
                                } else if (obj2 instanceof Double) {
/* 140 */                           zzhvVarZzn2.zzh(((Double) obj2).doubleValue());
                                }
/* 143 */                       zzhvVarZzn.zzk(zzhvVarZzn2);
                            }
/* 151 */                   if (zzhvVarZzn.zzj() > 0) {
/* 159 */                       arrayList.add((zzhw) zzhvVarZzn.zzbc());
                            }
                        }
                    }
/* 165 */           zzhvVar.zzl(arrayList);
                }

                /* JADX INFO: renamed from: a0 */
                public zzog m1687a0(String str, zzic zzicVar, zzhr zzhrVar, String str2) {
                    int iIndexOf;
/* 5 */             zzql.zza();
/* 10 */            ij3 ij3Var = (ij3) this.f16749a;
/* 12 */            pd3 pd3Var = ij3Var.f9651d;
/* 21 */            if (!pd3Var.m7406J(str, vg3.f18094P0)) {
/* 20 */                return null;
                    }
/* 25 */            ij3Var.f9640V.getClass();
/* 28 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 40 */            String[] strArrSplit = pd3Var.m7402F(str, vg3.f18166u0).split(",");
/* 47 */            HashSet hashSet = new HashSet(strArrSplit.length);
/* 53 */            for (String str3 : strArrSplit) {
/* 57 */                Objects.requireNonNull(str3);
/* 64 */                if (!hashSet.add(str3)) {
/* 71 */                    s80.m8430k(str3, "duplicate element: ");
/* 20 */                    return null;
                        }
                    }
/* 75 */            Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
/* 79 */            mp3 mp3Var = this.f15676b;
/* 81 */            yo3 yo3Var = mp3Var.f13903U;
/* 83 */            vi3 vi3Var = mp3Var.f13909a;
/* 87 */            vi3 vi3Var2 = yo3Var.f15676b.f13909a;
/* 89 */            mp3.m6728S(vi3Var2);
/* 92 */            String strM9287M = vi3Var2.m9287M(str);
/* 98 */            Uri.Builder builder = new Uri.Builder();
/* 105 */           pd3 pd3Var2 = ((ij3) yo3Var.f16749a).f9651d;
/* 113 */           builder.scheme(pd3Var2.m7402F(str, vg3.f18152n0));
/* 123 */           if (TextUtils.isEmpty(strM9287M)) {
/* 177 */               builder.authority(pd3Var2.m7402F(str, vg3.f18154o0));
                    } else {
/* 127 */               String strM7402F = pd3Var2.m7402F(str, vg3.f18154o0);
/* 151 */               StringBuilder sb = new StringBuilder(String.valueOf(strM9287M).length() + 1 + String.valueOf(strM7402F).length());
/* 154 */               sb.append(strM9287M);
/* 157 */               sb.append(".");
/* 160 */               sb.append(strM7402F);
/* 167 */               builder.authority(sb.toString());
                    }
/* 186 */           builder.path(pd3Var2.m7402F(str, vg3.f18156p0));
/* 195 */           m1664M(builder, "gmp_app_id", zzicVar.zzac(), setUnmodifiableSet);
/* 198 */           pd3Var.m7401E();
/* 210 */           m1664M(builder, "gmp_version", String.valueOf(130000L), setUnmodifiableSet);
/* 213 */           String strZzV = zzicVar.zzV();
/* 217 */           ug3 ug3Var = vg3.f18100S0;
/* 223 */           if (pd3Var.m7406J(str, ug3Var)) {
/* 225 */               mp3.m6728S(vi3Var);
/* 232 */               if (vi3Var.m9293S(str)) {
/* 234 */                   strZzV = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    }
/* 238 */           m1664M(builder, "app_instance_id", strZzV, setUnmodifiableSet);
/* 247 */           m1664M(builder, "rdid", zzicVar.zzP(), setUnmodifiableSet);
/* 256 */           m1664M(builder, "bundle_id", zzicVar.zzK(), setUnmodifiableSet);
/* 259 */           String strZzk = zzhrVar.zzk();
/* 267 */           String strM7889V = qj3.m7889V(strZzk, i13.f9405h, i13.f9403f);
/* 275 */           if (true != TextUtils.isEmpty(strM7889V)) {
/* 277 */               strZzk = strM7889V;
                    }
/* 280 */           m1664M(builder, "app_event_name", strZzk, setUnmodifiableSet);
/* 293 */           m1664M(builder, "app_version", String.valueOf(zzicVar.zzai()), setUnmodifiableSet);
/* 296 */           String strZzD = zzicVar.zzD();
/* 304 */           if (pd3Var.m7406J(str, ug3Var)) {
/* 306 */               mp3.m6728S(vi3Var);
/* 313 */               if (vi3Var.m9292R(str) && !TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(".")) != -1) {
/* 328 */                   strZzD = strZzD.substring(0, iIndexOf);
                        }
                    }
/* 334 */           m1664M(builder, "os_version", strZzD, setUnmodifiableSet);
/* 347 */           m1664M(builder, "timestamp", String.valueOf(zzhrVar.zzn()), setUnmodifiableSet);
/* 356 */           if (zzicVar.zzS()) {
/* 360 */               m1664M(builder, "lat", "1", setUnmodifiableSet);
                    }
/* 373 */           m1664M(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), setUnmodifiableSet);
/* 378 */           m1664M(builder, "trigger_uri_source", "1", setUnmodifiableSet);
/* 387 */           m1664M(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
/* 394 */           m1664M(builder, "request_uuid", str2, setUnmodifiableSet);
/* 397 */           List<zzhw> listZza = zzhrVar.zza();
/* 403 */           Bundle bundle = new Bundle();
/* 414 */           for (zzhw zzhwVar : listZza) {
/* 422 */               String strZzb = zzhwVar.zzb();
/* 430 */               if (zzhwVar.zzi()) {
/* 440 */                   bundle.putString(strZzb, String.valueOf(zzhwVar.zzj()));
                        } else if (zzhwVar.zzg()) {
/* 458 */                   bundle.putString(strZzb, String.valueOf(zzhwVar.zzh()));
                        } else if (zzhwVar.zzc()) {
/* 472 */                   bundle.putString(strZzb, zzhwVar.zzd());
                        } else if (zzhwVar.zze()) {
/* 490 */                   bundle.putString(strZzb, String.valueOf(zzhwVar.zzf()));
                        }
                    }
/* 506 */           m1667P(builder, pd3Var.m7402F(str, vg3.f18164t0).split("\\|"), bundle, setUnmodifiableSet);
/* 509 */           List<zziu> listZzk = zzicVar.zzk();
/* 515 */           Bundle bundle2 = new Bundle();
/* 526 */           for (zziu zziuVar : listZzk) {
/* 534 */               String strZzc = zziuVar.zzc();
/* 542 */               if (zziuVar.zzj()) {
/* 552 */                   bundle2.putString(strZzc, String.valueOf(zziuVar.zzk()));
                        } else if (zziuVar.zzh()) {
/* 570 */                   bundle2.putString(strZzc, String.valueOf(zziuVar.zzi()));
                        } else if (zziuVar.zzd()) {
/* 584 */                   bundle2.putString(strZzc, zziuVar.zze());
                        } else if (zziuVar.zzf()) {
/* 602 */                   bundle2.putString(strZzc, String.valueOf(zziuVar.zzg()));
                        }
                    }
/* 616 */           m1667P(builder, pd3Var.m7402F(str, vg3.f18162s0).split("\\|"), bundle2, setUnmodifiableSet);
/* 629 */           m1664M(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", setUnmodifiableSet);
/* 640 */           if (!zzicVar.zzaE().isEmpty()) {
/* 648 */               m1664M(builder, "dma_cps", zzicVar.zzaE(), setUnmodifiableSet);
                    }
/* 655 */           if (zzicVar.zzaK()) {
/* 657 */               zzha zzhaVarZzaL = zzicVar.zzaL();
/* 669 */               if (!zzhaVarZzaL.zzb().isEmpty()) {
/* 677 */                   m1664M(builder, "dl_gclid", zzhaVarZzaL.zzb(), setUnmodifiableSet);
                        }
/* 688 */               if (!zzhaVarZzaL.zzd().isEmpty()) {
/* 696 */                   m1664M(builder, "dl_gbraid", zzhaVarZzaL.zzd(), setUnmodifiableSet);
                        }
/* 707 */               if (!zzhaVarZzaL.zzf().isEmpty()) {
/* 715 */                   m1664M(builder, "dl_gs", zzhaVarZzaL.zzf(), setUnmodifiableSet);
                        }
/* 726 */               if (zzhaVarZzaL.zzh() > 0) {
/* 738 */                   m1664M(builder, "dl_ss_ts", String.valueOf(zzhaVarZzaL.zzh()), setUnmodifiableSet);
                        }
/* 749 */               if (!zzhaVarZzaL.zzj().isEmpty()) {
/* 757 */                   m1664M(builder, "mr_gclid", zzhaVarZzaL.zzj(), setUnmodifiableSet);
                        }
/* 768 */               if (!zzhaVarZzaL.zzm().isEmpty()) {
/* 776 */                   m1664M(builder, "mr_gbraid", zzhaVarZzaL.zzm(), setUnmodifiableSet);
                        }
/* 787 */               if (!zzhaVarZzaL.zzo().isEmpty()) {
/* 795 */                   m1664M(builder, "mr_gs", zzhaVarZzaL.zzo(), setUnmodifiableSet);
                        }
/* 804 */               if (zzhaVarZzaL.zzq() > 0) {
/* 816 */                   m1664M(builder, "mr_click_ts", String.valueOf(zzhaVarZzaL.zzq()), setUnmodifiableSet);
                        }
                    }
/* 829 */           return new zzog(builder.build().toString(), jCurrentTimeMillis, 1);
                }

                /* JADX INFO: renamed from: b0 */
                public zzhs m1688b0(oe3 oe3Var) {
/* 1 */             zzhr zzhrVarZzk = zzhs.zzk();
/* 7 */             zzhrVarZzk.zzq(oe3Var.f14731e);
/* 10 */            zzbe zzbeVar = oe3Var.f14732f;
/* 12 */            Objects.requireNonNull(zzbeVar);
/* 15 */            Bundle bundle = zzbeVar.f4207a;
/* 29 */            for (String str : bundle.keySet()) {
/* 37 */                zzhv zzhvVarZzn = zzhw.zzn();
/* 41 */                zzhvVarZzn.zzb(str);
/* 44 */                Object obj = bundle.get(str);
/* 48 */                kb1.m6061n(obj);
/* 51 */                m1686Z(zzhvVarZzn, obj);
/* 54 */                zzhrVarZzk.zzg(zzhvVarZzn);
                    }
/* 58 */            String str2 = oe3Var.f14729c;
/* 64 */            if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
/* 74 */                zzhv zzhvVarZzn2 = zzhw.zzn();
/* 78 */                zzhvVarZzn2.zzb("_o");
/* 81 */                zzhvVarZzn2.zzd(str2);
/* 90 */                zzhrVarZzk.zzf((zzhw) zzhvVarZzn2.zzbc());
                    }
/* 97 */            return (zzhs) zzhrVarZzk.zzbc();
                }

                /* JADX INFO: renamed from: c0 */
                public String m1689c0(zzib zzibVar) {
                    String str;
                    String str2;
                    String str3;
                    zzhe zzheVarZzat;
/* 1 */             if (zzibVar == null) {
/* 3 */                 return HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 8 */             StringBuilder sbM3512p = AbstractC0886en.m3512p("\nbatch {\n");
/* 17 */            if (zzibVar.zzf()) {
/* 25 */                m1669R(sbM3512p, 0, "upload_subdomain", zzibVar.zzg());
                    }
/* 32 */            if (zzibVar.zzd()) {
/* 40 */                m1669R(sbM3512p, 0, "sgtm_join_id", zzibVar.zze());
                    }
/* 55 */            for (zzid zzidVar : zzibVar.zza()) {
/* 63 */                if (zzidVar != null) {
/* 66 */                    m1663L(1, sbM3512p);
/* 71 */                    sbM3512p.append("bundle {\n");
/* 78 */                    if (zzidVar.zza()) {
/* 90 */                        m1669R(sbM3512p, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                            }
/* 93 */                    zzqu.zza();
/* 98 */                    ij3 ij3Var = (ij3) this.f16749a;
/* 100 */                   pd3 pd3Var = ij3Var.f9651d;
/* 102 */                   mh3 mh3Var = ij3Var.f9639U;
/* 114 */                   if (pd3Var.m7406J(zzidVar.zzA(), vg3.f18088M0) && zzidVar.zzag()) {
/* 128 */                       m1669R(sbM3512p, 1, "session_stitching_token", zzidVar.zzah());
                            }
/* 137 */                   m1669R(sbM3512p, 1, "platform", zzidVar.zzt());
/* 144 */                   if (zzidVar.zzC()) {
/* 156 */                       m1669R(sbM3512p, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                            }
/* 163 */                   if (zzidVar.zzE()) {
/* 175 */                       m1669R(sbM3512p, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                            }
/* 182 */                   if (zzidVar.zzac()) {
/* 194 */                       m1669R(sbM3512p, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                            }
/* 201 */                   if (zzidVar.zzW()) {
/* 213 */                       m1669R(sbM3512p, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                            }
/* 222 */                   m1669R(sbM3512p, 1, "gmp_app_id", zzidVar.zzP());
/* 231 */                   m1669R(sbM3512p, 1, "app_id", zzidVar.zzA());
/* 240 */                   m1669R(sbM3512p, 1, "app_version", zzidVar.zzB());
/* 247 */                   if (zzidVar.zzU()) {
/* 259 */                       m1669R(sbM3512p, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                            }
/* 268 */                   m1669R(sbM3512p, 1, "firebase_instance_id", zzidVar.zzT());
/* 275 */                   if (zzidVar.zzK()) {
/* 287 */                       m1669R(sbM3512p, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                            }
/* 296 */                   m1669R(sbM3512p, 1, "app_store", zzidVar.zzz());
/* 303 */                   if (zzidVar.zzi()) {
/* 315 */                       m1669R(sbM3512p, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzj()));
                            }
/* 322 */                   if (zzidVar.zzk()) {
/* 334 */                       m1669R(sbM3512p, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                            }
/* 341 */                   if (zzidVar.zzn()) {
/* 353 */                       m1669R(sbM3512p, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                            }
/* 360 */                   if (zzidVar.zzp()) {
/* 372 */                       m1669R(sbM3512p, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                            }
/* 379 */                   if (zzidVar.zzr()) {
/* 391 */                       m1669R(sbM3512p, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                            }
/* 400 */                   m1669R(sbM3512p, 1, "app_instance_id", zzidVar.zzJ());
/* 409 */                   m1669R(sbM3512p, 1, "resettable_device_id", zzidVar.zzG());
/* 418 */                   m1669R(sbM3512p, 1, "ds_id", zzidVar.zzZ());
/* 425 */                   if (zzidVar.zzH()) {
/* 437 */                       m1669R(sbM3512p, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                            }
/* 446 */                   m1669R(sbM3512p, 1, "os_version", zzidVar.zzu());
/* 455 */                   m1669R(sbM3512p, 1, "device_model", zzidVar.zzv());
/* 464 */                   m1669R(sbM3512p, 1, "user_default_language", zzidVar.zzw());
/* 471 */                   if (zzidVar.zzx()) {
/* 483 */                       m1669R(sbM3512p, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                            }
/* 490 */                   if (zzidVar.zzM()) {
/* 502 */                       m1669R(sbM3512p, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                            }
/* 509 */                   if (zzidVar.zzau()) {
/* 521 */                       m1669R(sbM3512p, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                            }
/* 528 */                   if (zzidVar.zzQ()) {
/* 540 */                       m1669R(sbM3512p, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                            }
/* 549 */                   m1669R(sbM3512p, 1, "health_monitor", zzidVar.zzO());
/* 556 */                   if (zzidVar.zzaa()) {
/* 568 */                       m1669R(sbM3512p, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                            }
/* 575 */                   if (zzidVar.zzae()) {
/* 583 */                       m1669R(sbM3512p, 1, "consent_signals", zzidVar.zzaf());
                            }
/* 590 */                   if (zzidVar.zzan()) {
/* 602 */                       m1669R(sbM3512p, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                            }
/* 609 */                   if (zzidVar.zzap()) {
/* 617 */                       m1669R(sbM3512p, 1, "core_platform_services", zzidVar.zzaq());
                            }
/* 624 */                   if (zzidVar.zzal()) {
/* 632 */                       m1669R(sbM3512p, 1, "consent_diagnostics", zzidVar.zzam());
                            }
/* 639 */                   if (zzidVar.zzai()) {
/* 651 */                       m1669R(sbM3512p, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                            }
/* 654 */                   zzql.zza();
/* 672 */                   if (ij3Var.f9651d.m7406J(zzidVar.zzA(), vg3.f18094P0)) {
/* 684 */                       m1669R(sbM3512p, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
/* 691 */                       if (zzidVar.zzas() && (zzheVarZzat = zzidVar.zzat()) != null) {
/* 699 */                           m1663L(2, sbM3512p);
/* 704 */                           sbM3512p.append("attribution_eligibility_status {\n");
/* 717 */                           m1669R(sbM3512p, 2, "eligible", Boolean.valueOf(zzheVarZzat.zza()));
/* 730 */                           m1669R(sbM3512p, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzheVarZzat.zzb()));
/* 743 */                           m1669R(sbM3512p, 2, "pre_r", Boolean.valueOf(zzheVarZzat.zzc()));
/* 756 */                           m1669R(sbM3512p, 2, "r_extensions_too_old", Boolean.valueOf(zzheVarZzat.zzd()));
/* 769 */                           m1669R(sbM3512p, 2, "adservices_extension_too_old", Boolean.valueOf(zzheVarZzat.zze()));
/* 782 */                           m1669R(sbM3512p, 2, "ad_storage_not_allowed", Boolean.valueOf(zzheVarZzat.zzf()));
/* 795 */                           m1669R(sbM3512p, 2, "measurement_manager_disabled", Boolean.valueOf(zzheVarZzat.zzg()));
/* 798 */                           m1663L(2, sbM3512p);
/* 801 */                           sbM3512p.append("}\n");
                                }
                            }
/* 808 */                   if (zzidVar.zzaw()) {
/* 810 */                       zzha zzhaVarZzax = zzidVar.zzax();
/* 814 */                       m1663L(2, sbM3512p);
/* 819 */                       sbM3512p.append("ad_campaign_info {\n");
/* 826 */                       if (zzhaVarZzax.zza()) {
/* 834 */                           m1669R(sbM3512p, 2, "deep_link_gclid", zzhaVarZzax.zzb());
                                }
/* 841 */                       if (zzhaVarZzax.zzc()) {
/* 849 */                           m1669R(sbM3512p, 2, "deep_link_gbraid", zzhaVarZzax.zzd());
                                }
/* 856 */                       if (zzhaVarZzax.zze()) {
/* 864 */                           m1669R(sbM3512p, 2, "deep_link_gad_source", zzhaVarZzax.zzf());
                                }
/* 871 */                       if (zzhaVarZzax.zzg()) {
/* 883 */                           m1669R(sbM3512p, 2, "deep_link_session_millis", Long.valueOf(zzhaVarZzax.zzh()));
                                }
/* 890 */                       if (zzhaVarZzax.zzi()) {
/* 898 */                           m1669R(sbM3512p, 2, "market_referrer_gclid", zzhaVarZzax.zzj());
                                }
/* 905 */                       if (zzhaVarZzax.zzk()) {
/* 913 */                           m1669R(sbM3512p, 2, "market_referrer_gbraid", zzhaVarZzax.zzm());
                                }
/* 920 */                       if (zzhaVarZzax.zzn()) {
/* 928 */                           m1669R(sbM3512p, 2, "market_referrer_gad_source", zzhaVarZzax.zzo());
                                }
/* 935 */                       if (zzhaVarZzax.zzp()) {
/* 947 */                           m1669R(sbM3512p, 2, "market_referrer_click_millis", Long.valueOf(zzhaVarZzax.zzq()));
                                }
/* 950 */                       m1663L(2, sbM3512p);
/* 953 */                       sbM3512p.append("}\n");
                            }
/* 960 */                   if (zzidVar.zzaA()) {
/* 972 */                       m1669R(sbM3512p, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                            }
/* 981 */                   if (zzidVar.zzay()) {
/* 983 */                       zzis zzisVarZzaz = zzidVar.zzaz();
/* 987 */                       m1663L(2, sbM3512p);
/* 992 */                       sbM3512p.append("sgtm_diagnostics {\n");
/* 995 */                       int iZzf = zzisVarZzaz.zzf();
/* 999 */                       if (iZzf == 1) {
/* 1019 */                          str2 = "UPLOAD_TYPE_UNKNOWN";
                                } else if (iZzf == 2) {
/* 1016 */                          str2 = "GA_UPLOAD";
                                } else if (iZzf != 3) {
/* 1010 */                          str2 = iZzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                                } else {
/* 1013 */                          str2 = "SDK_CLIENT_UPLOAD";
                                }
/* 1023 */                      m1669R(sbM3512p, 2, "upload_type", str2);
/* 1036 */                      m1669R(sbM3512p, 2, "client_upload_eligibility", zzisVarZzaz.zza().name());
/* 1039 */                      int iZzg = zzisVarZzaz.zzg();
/* 1043 */                      if (iZzg == 1) {
/* 1069 */                          str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                                } else if (iZzg == 2) {
/* 1066 */                          str3 = "SERVICE_UPLOAD_ELIGIBLE";
                                } else if (iZzg == 3) {
/* 1063 */                          str3 = "NOT_IN_ROLLOUT";
                                } else if (iZzg != 4) {
/* 1057 */                          str3 = iZzg != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                                } else {
/* 1060 */                          str3 = "MISSING_SGTM_SETTINGS";
                                }
/* 1073 */                      m1669R(sbM3512p, 2, "service_upload_eligibility", str3);
/* 1076 */                      m1663L(2, sbM3512p);
/* 1079 */                      sbM3512p.append("}\n");
                            }
/* 1086 */                  if (zzidVar.zzaC()) {
/* 1088 */                      zzho zzhoVarZzaD = zzidVar.zzaD();
/* 1092 */                      m1663L(2, sbM3512p);
/* 1097 */                      sbM3512p.append("consent_info_extra {\n");
/* 1112 */                      for (zzhl zzhlVar : zzhoVarZzaD.zza()) {
/* 1120 */                          m1663L(3, sbM3512p);
/* 1125 */                          sbM3512p.append("limited_data_modes {\n");
/* 1128 */                          int iZzc = zzhlVar.zzc();
/* 1132 */                          if (iZzc == 1) {
/* 1152 */                              str = "CONSENT_TYPE_UNSPECIFIED";
                                    } else if (iZzc == 2) {
/* 1149 */                              str = "AD_STORAGE";
                                    } else if (iZzc != 3) {
/* 1143 */                              str = iZzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                                    } else {
/* 1146 */                              str = "ANALYTICS_STORAGE";
                                    }
/* 1156 */                          m1669R(sbM3512p, 3, "type", str);
/* 1159 */                          int iZzd = zzhlVar.zzd();
/* 1177 */                          m1669R(sbM3512p, 3, "mode", iZzd != 1 ? iZzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
/* 1180 */                          m1663L(3, sbM3512p);
/* 1183 */                          sbM3512p.append("}\n");
                                }
/* 1187 */                      m1663L(2, sbM3512p);
/* 1190 */                      sbM3512p.append("}\n");
                            }
/* 1193 */                  List<zziu> listZzf = zzidVar.zzf();
/* 1199 */                  if (listZzf != null) {
/* 1211 */                      for (zziu zziuVar : listZzf) {
/* 1219 */                          if (zziuVar != null) {
/* 1221 */                              m1663L(2, sbM3512p);
/* 1226 */                              sbM3512p.append("user_property {\n");
/* 1248 */                              m1669R(sbM3512p, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
/* 1259 */                              m1669R(sbM3512p, 2, "name", mh3Var.m6658c(zziuVar.zzc()));
/* 1268 */                              m1669R(sbM3512p, 2, "string_value", zziuVar.zze());
/* 1289 */                              m1669R(sbM3512p, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzg()) : null);
/* 1308 */                              m1669R(sbM3512p, 2, "double_value", zziuVar.zzj() ? Double.valueOf(zziuVar.zzk()) : null);
/* 1311 */                              m1663L(2, sbM3512p);
/* 1314 */                              sbM3512p.append("}\n");
                                    }
                                }
                            }
/* 1318 */                  List<zzhg> listZzS = zzidVar.zzS();
/* 1322 */                  if (listZzS != null) {
/* 1333 */                      for (zzhg zzhgVar : listZzS) {
/* 1341 */                          if (zzhgVar != null) {
/* 1343 */                              m1663L(2, sbM3512p);
/* 1348 */                              sbM3512p.append("audience_membership {\n");
/* 1355 */                              if (zzhgVar.zza()) {
/* 1367 */                                  m1669R(sbM3512p, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                                        }
/* 1374 */                              if (zzhgVar.zzf()) {
/* 1386 */                                  m1669R(sbM3512p, 2, "new_audience", Boolean.valueOf(zzhgVar.zzg()));
                                        }
/* 1395 */                              m1668Q(sbM3512p, "current_data", zzhgVar.zzc());
/* 1402 */                              if (zzhgVar.zzd()) {
/* 1410 */                                  m1668Q(sbM3512p, "previous_data", zzhgVar.zze());
                                        }
/* 1413 */                              m1663L(2, sbM3512p);
/* 1416 */                              sbM3512p.append("}\n");
                                    }
                                }
                            }
/* 1420 */                  List<zzhs> listZzc = zzidVar.zzc();
/* 1424 */                  if (listZzc != null) {
/* 1435 */                      for (zzhs zzhsVar : listZzc) {
/* 1443 */                          if (zzhsVar != null) {
/* 1445 */                              m1663L(2, sbM3512p);
/* 1450 */                              sbM3512p.append("event {\n");
/* 1461 */                              m1669R(sbM3512p, 2, "name", mh3Var.m6656a(zzhsVar.zzd()));
/* 1468 */                              if (zzhsVar.zze()) {
/* 1480 */                                  m1669R(sbM3512p, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                        }
/* 1487 */                              if (zzhsVar.zzg()) {
/* 1499 */                                  m1669R(sbM3512p, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzh()));
                                        }
/* 1506 */                              if (zzhsVar.zzi()) {
/* 1518 */                                  m1669R(sbM3512p, 2, "count", Integer.valueOf(zzhsVar.zzj()));
                                        }
/* 1525 */                              if (zzhsVar.zzb() != 0) {
/* 1531 */                                  m1681J(sbM3512p, 2, zzhsVar.zza());
                                        }
/* 1534 */                              m1663L(2, sbM3512p);
/* 1537 */                              sbM3512p.append("}\n");
                                    }
                                }
                            }
/* 1541 */                  m1663L(1, sbM3512p);
/* 1544 */                  sbM3512p.append("}\n");
                        }
                    }
/* 1551 */          sbM3512p.append("} // End-of-batch\n");
/* 1554 */          return sbM3512p.toString();
                }

                /* JADX INFO: renamed from: d0 */
                public String m1690d0(zzfn zzfnVar) {
/* 3 */             StringBuilder sbM3512p = AbstractC0886en.m3512p("\nproperty_filter {\n");
/* 12 */            if (zzfnVar.zza()) {
/* 24 */                m1669R(sbM3512p, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
                    }
/* 43 */            m1669R(sbM3512p, 0, "property_name", ((ij3) this.f16749a).f9639U.m6658c(zzfnVar.zzc()));
/* 58 */            String strM1665N = m1665N(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzh());
/* 66 */            if (!strM1665N.isEmpty()) {
/* 70 */                m1669R(sbM3512p, 0, "filter_type", strM1665N);
                    }
/* 78 */            m1682K(sbM3512p, 1, zzfnVar.zzd());
/* 83 */            sbM3512p.append("}\n");
/* 86 */            return sbM3512p.toString();
                }

                /* JADX INFO: renamed from: e0 */
                public Parcelable m1691e0(byte[] bArr, Parcelable.Creator creator) {
/* 1 */             Parcelable parcelable = null;
/* 2 */             if (bArr == null) {
/* 1 */                 return null;
                    }
/* 5 */             Parcel parcelObtain = Parcel.obtain();
                    try {
/* 11 */                parcelObtain.unmarshall(bArr, 0, bArr.length);
/* 14 */                parcelObtain.setDataPosition(0);
/* 21 */                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
                    } catch (g62 unused) {
/* 31 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 33 */                ij3.m4555l(uh3Var);
/* 40 */                uh3Var.f17538f.m8510a("Failed to load parcelable from buffer");
                    } finally {
/* 47 */                parcelObtain.recycle();
                    }
/* 46 */            return parcelable;
                }

                /* JADX INFO: renamed from: i0 */
                public List m1692i0(List list, List list2) {
                    int i;
/* 3 */             ij3 ij3Var = (ij3) this.f16749a;
/* 7 */             ArrayList arrayList = new ArrayList(list);
/* 10 */            Iterator it = list2.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                Integer num = (Integer) it.next();
/* 30 */                if (num.intValue() < 0) {
/* 32 */                    uh3 uh3Var = ij3Var.f9655f;
/* 34 */                    ij3.m4555l(uh3Var);
/* 41 */                    uh3Var.f17541w.m8511b(num, "Ignoring negative bit index to be cleared");
                        } else {
/* 49 */                    int iIntValue = num.intValue() / 64;
/* 55 */                    if (iIntValue >= arrayList.size()) {
/* 57 */                        uh3 uh3Var2 = ij3Var.f9655f;
/* 59 */                        ij3.m4555l(uh3Var2);
/* 74 */                        uh3Var2.f17541w.m8512c(num, "Ignoring bit index greater than bitSet size", Integer.valueOf(arrayList.size()));
                            } else {
/* 103 */                       arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                            }
                        }
                    }
/* 107 */           int size = arrayList.size();
/* 115 */           int size2 = arrayList.size() - 1;
                    while (true) {
/* 117 */               int i2 = size2;
/* 118 */               i = size;
/* 119 */               size = i2;
/* 120 */               if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                            break;
                        }
/* 139 */               size2 = size - 1;
                    }
/* 143 */           return arrayList.subList(0, i);
                }

                /* JADX INFO: renamed from: j0 */
                public boolean m1693j0(long j, long j2) {
/* 5 */             if (j == 0 || j2 <= 0) {
/* 36 */                return true;
                    }
/* 17 */            ((ij3) this.f16749a).f9640V.getClass();
                    return Math.abs(System.currentTimeMillis() - j) > j2;
                }

                /* JADX INFO: renamed from: k0 */
                public long m1694k0(byte[] bArr) {
/* 1 */             kb1.m6061n(bArr);
/* 6 */             ij3 ij3Var = (ij3) this.f16749a;
/* 8 */             up3 up3Var = ij3Var.f9668w;
/* 10 */            ij3.m4553j(up3Var);
/* 13 */            up3Var.mo1375y();
/* 16 */            MessageDigest messageDigestM9063Q = up3.m9063Q();
/* 20 */            if (messageDigestM9063Q != null) {
/* 41 */                return up3.m9064R(messageDigestM9063Q.digest(bArr));
                    }
/* 22 */            uh3 uh3Var = ij3Var.f9655f;
/* 24 */            ij3.m4555l(uh3Var);
/* 31 */            uh3Var.f17538f.m8510a("Failed to get MD5");
/* 34 */            return 0L;
                }

                /* JADX INFO: renamed from: l0 */
                public byte[] m1695l0(byte[] bArr) throws IOException {
                    try {
/* 3 */                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 8 */                 GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
/* 11 */                gZIPOutputStream.write(bArr);
/* 14 */                gZIPOutputStream.close();
/* 17 */                byteArrayOutputStream.close();
/* 20 */                return byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
/* 30 */                uh3 uh3Var = ((ij3) this.f16749a).f9655f;
/* 32 */                ij3.m4555l(uh3Var);
/* 39 */                uh3Var.f17538f.m8511b(e, "Failed to gzip content");
/* 42 */                throw e;
                    }
                }
            }
