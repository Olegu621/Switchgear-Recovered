            package p000;

            import android.content.SharedPreferences;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.usercentrics.sdk.services.deviceStorage.models.ConsentsBuffer;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentAction;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentHistory;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentType;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageService;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageSessionEntry;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageSettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import kotlin.collections.C1839a;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.reflect.KTypeProjection;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pz2 implements g80 {

                /* JADX INFO: renamed from: a */
                public final we2 f15350a;

                /* JADX INFO: renamed from: b */
                public final i03 f15351b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f15352c;

                /* JADX INFO: renamed from: d */
                public final od2 f15353d;

                /* JADX INFO: renamed from: e */
                public final od2 f15354e;

                /* JADX INFO: renamed from: f */
                public StorageSettings f15355f = new StorageSettings();

                /* JADX INFO: renamed from: g */
                public StorageTCF f15356g = new StorageTCF();

                public pz2(we2 we2Var, i03 i03Var, int i, ArrayList arrayList, a21 a21Var) {
/* 4 */             this.f15350a = we2Var;
/* 6 */             this.f15351b = i03Var;
/* 8 */             this.f15352c = arrayList;
/* 14 */            this.f15353d = (od2) we2Var.f18596c;
/* 20 */            this.f15354e = (od2) we2Var.f18595b;
                }

                /* JADX INFO: renamed from: a */
                public final void m7629a() {
/* 6 */             this.f15351b.mo2906a("Clearing local storage", null);
/* 9 */             fh2[] fh2VarArr = fh2.f8216a;
/* 13 */            List listM6210b = C1839a.m6210b(FirebaseAnalytics.Param.LOCATION);
/* 17 */            od2 od2Var = this.f15354e;
/* 19 */            od2Var.getClass();
/* 22 */            listM6210b.getClass();
/* 25 */            SharedPreferences sharedPreferences = od2Var.f14716a;
/* 27 */            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
/* 47 */            for (String str : sharedPreferences.getAll().keySet()) {
/* 59 */                if (!listM6210b.contains(str)) {
/* 62 */                    editorEdit.remove(str);
                        }
                    }
/* 66 */            editorEdit.apply();
/* 69 */            m7630b();
/* 76 */            this.f15353d.m7135a("IABUSPrivacy_String");
/* 84 */            this.f15355f = new StorageSettings();
/* 91 */            this.f15356g = new StorageTCF();
                }

                /* JADX INFO: renamed from: b */
                public final void m7630b() {
                    od2 od2Var;
/* 1 */             bv0[] bv0VarArrValues = bv0.values();
/* 5 */             int length = bv0VarArrValues.length;
/* 6 */             int i = 0;
                    while (true) {
/* 7 */                 od2Var = this.f15353d;
/* 9 */                 if (i >= length) {
                            break;
                        }
/* 15 */                od2Var.m7135a(bv0VarArrValues[i].f2614a);
/* 18 */                i++;
                    }
/* 24 */            for (int i2 = 1; i2 < 12; i2++) {
/* 28 */                bv0.Companion.getClass();
/* 45 */                od2Var.m7135a("IABTCF_PublisherRestrictions" + i2);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final ConsentsBuffer m7631c() {
/* 1 */             jb1.m5748h();
/* 4 */             fh2[] fh2VarArr = fh2.f8216a;
/* 6 */             od2 od2Var = this.f15354e;
/* 8 */             od2Var.getClass();
/* 16 */            String string = od2Var.f14716a.getString("consents_buffer", null);
/* 20 */            if (string == null) {
/* 22 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 36 */            ConsentsBuffer consentsBuffer = (ConsentsBuffer) b21.m1203a(b21.f2178a, ConsentsBuffer.Companion.serializer(), string, null);
                    return consentsBuffer == null ? new ConsentsBuffer(nd0.f14189a) : consentsBuffer;
                }

                /* JADX INFO: renamed from: d */
                public final Long m7632d() {
/* 3 */             List list = this.f15355f.f6142d;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 10 */            Iterator it = list.iterator();
                    while (true) {
/* 18 */                Long lValueOf = null;
/* 19 */                if (!it.hasNext()) {
                            break;
                        }
/* 27 */                List list2 = ((StorageService) it.next()).f6132a;
/* 31 */                ArrayList arrayList2 = new ArrayList();
/* 42 */                for (Object obj : list2) {
/* 49 */                    StorageConsentHistory storageConsentHistory = (StorageConsentHistory) obj;
/* 55 */                    if (storageConsentHistory.f6122a == StorageConsentAction.f6118f || storageConsentHistory.f6124c != StorageConsentType.f6129c) {
/* 64 */                        arrayList2.add(obj);
                            }
                        }
/* 68 */                Iterator it2 = arrayList2.iterator();
/* 76 */                if (it2.hasNext()) {
/* 87 */                    lValueOf = Long.valueOf(((StorageConsentHistory) it2.next()).f6126e);
/* 95 */                    while (it2.hasNext()) {
/* 105 */                       Long lValueOf2 = Long.valueOf(((StorageConsentHistory) it2.next()).f6126e);
/* 113 */                       if (lValueOf.compareTo(lValueOf2) < 0) {
/* 115 */                           lValueOf = lValueOf2;
                                }
                            }
                        }
/* 117 */               if (lValueOf != null) {
/* 119 */                   arrayList.add(lValueOf);
                        }
                    }
/* 123 */           Iterator it3 = arrayList.iterator();
/* 131 */           if (!it3.hasNext()) {
/* 18 */                return null;
                    }
/* 144 */           Long lValueOf3 = Long.valueOf(((Number) it3.next()).longValue());
/* 152 */           while (it3.hasNext()) {
/* 164 */               Long lValueOf4 = Long.valueOf(((Number) it3.next()).longValue());
/* 172 */               if (lValueOf3.compareTo(lValueOf4) < 0) {
/* 174 */                   lValueOf3 = lValueOf4;
                        }
                    }
/* 176 */           return lValueOf3;
                }

                /* JADX INFO: renamed from: e */
                public final void m7633e(int i, int i2) throws yi1 {
                    Object next;
/* 1 */             ArrayList<ui1> arrayList = this.f15352c;
/* 3 */             Iterator it = arrayList.iterator();
                    while (true) {
/* 11 */                if (!it.hasNext()) {
/* 29 */                    next = null;
                            break;
                        }
/* 13 */                next = it.next();
/* 20 */                int i3 = ((ui1) next).f17545b;
/* 24 */                if (i3 - 1 == i && i3 == i2) {
                            break;
                        }
                    }
/* 32 */            if (((ui1) next) == null) {
/* 68 */                throw new yi1(i, i2);
                    }
/* 42 */            for (ui1 ui1Var : arrayList) {
/* 50 */                int i4 = ui1Var.f17545b;
/* 54 */                if (i4 - 1 == i && i4 == i2) {
/* 58 */                    ui1Var.mo294a();
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final List m7634f() {
/* 1 */             jb1.m5748h();
/* 4 */             fh2[] fh2VarArr = fh2.f8216a;
/* 6 */             od2 od2Var = this.f15354e;
/* 8 */             od2Var.getClass();
/* 16 */            String string = od2Var.f14716a.getString("session_buffer", null);
/* 20 */            if (string == null || StringsKt.m6228D(string)) {
/* 82 */                return nd0.f14189a;
                    }
/* 29 */            r11 r11Var = b21.f2178a;
/* 31 */            C0168b5 c0168b5 = r11Var.f2163b;
/* 33 */            w21 w21Var = KTypeProjection.f12929c;
/* 37 */            js2 js2VarM5668b = j22.m5668b(StorageSessionEntry.class);
/* 41 */            w21Var.getClass();
/* 48 */            KTypeProjection kTypeProjection = new KTypeProjection(y21.f19457a, js2VarM5668b);
/* 51 */            k22 k22Var = j22.f12033a;
/* 55 */            C0857dv c0857dvM5667a = j22.m5667a(List.class);
/* 59 */            List listSingletonList = Collections.singletonList(kTypeProjection);
/* 63 */            k22Var.getClass();
/* 79 */            return (List) r11Var.m1198a(string, jb1.m5766z(c0168b5, new js2(c0857dvM5667a, listSingletonList)));
                }

                /* JADX INFO: renamed from: g */
                public final void m7635g(k61 k61Var, List list) {
                    bv1 bv1Var;
/* 5 */             k61Var.getClass();
/* 10 */            String str = this.f15355f.f6143e;
/* 12 */            boolean zM6228D = StringsKt.m6228D(str);
/* 16 */            od2 od2Var = this.f15354e;
/* 18 */            if (!zM6228D) {
/* 21 */                List list2 = k61Var.f12617h;
/* 27 */                if (!list2.isEmpty()) {
/* 40 */                    List listM6235K = StringsKt.m6235K(k61Var.f12620k, new char[]{'.'});
/* 48 */                    List listM6235K2 = StringsKt.m6235K(str, new char[]{'.'});
/* 52 */                    qc2[] qc2VarArr = qc2.f15486a;
/* 62 */                    if ((list2.contains(0) && !Intrinsics.m6216a(listM6235K.get(0), listM6235K2.get(0))) || ((list2.contains(1) && !Intrinsics.m6216a(listM6235K.get(1), listM6235K2.get(1))) || (list2.contains(2) && !Intrinsics.m6216a(listM6235K.get(2), listM6235K2.get(2))))) {
/* 127 */                       fh2[] fh2VarArr = fh2.f8216a;
/* 133 */                       od2Var.m7138d("user_action_required", "true");
                            }
                        }
                    }
/* 139 */           if (k61Var.f12616g) {
/* 141 */               C1029ij c1029ij = k61Var.f12618i;
/* 149 */               bv1Var = c1029ij != null ? ((cv1) c1029ij.f9631d).f6918b : null;
/* 151 */               bv1Var.getClass();
                    } else {
/* 155 */               C0875ec c0875ec = k61Var.f12619j;
/* 163 */               bv1Var = c0875ec != null ? ((cv1) c0875ec.f7614c).f6918b : null;
/* 165 */               bv1Var.getClass();
                    }
/* 170 */           String str2 = k61Var.f12614e;
/* 172 */           String str3 = k61Var.f12615f;
/* 174 */           String str4 = bv1Var.f2615a;
/* 178 */           int i = 10;
/* 186 */           ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 189 */           Iterator it = list.iterator();
/* 197 */           while (it.hasNext()) {
/* 203 */               m61 m61Var = (m61) it.next();
/* 207 */               List<j61> list3 = m61Var.f13590p.f9465a;
/* 215 */               ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list3, i));
/* 226 */               for (j61 j61Var : list3) {
/* 236 */                   StorageConsentHistory.Companion.getClass();
/* 239 */                   j61Var.getClass();
/* 244 */                   StorageConsentAction.Companion companion = StorageConsentAction.Companion;
/* 246 */                   kz2 kz2Var = j61Var.f12095a;
/* 248 */                   companion.getClass();
/* 251 */                   StorageConsentAction storageConsentActionM2780a = StorageConsentAction.Companion.m2780a(kz2Var);
/* 255 */                   boolean z = j61Var.f12096b;
/* 257 */                   StorageConsentType.Companion companion2 = StorageConsentType.Companion;
/* 261 */                   mz2 mz2Var = j61Var.f12097c;
/* 263 */                   companion2.getClass();
/* 281 */                   arrayList2.add(new StorageConsentHistory(storageConsentActionM2780a, z, StorageConsentType.Companion.m2782a(mz2Var), j61Var.f12098d, j61Var.f12099e));
                        }
/* 300 */               arrayList.add(new StorageService(arrayList2, m61Var.f13580f, m61Var.f13593s, m61Var.f13590p.f9466b));
/* 303 */               i = 10;
                    }
/* 308 */           StorageSettings storageSettings = new StorageSettings(str2, str3, str4, arrayList, k61Var.f12620k);
/* 311 */           this.f15355f = storageSettings;
/* 313 */           fh2[] fh2VarArr2 = fh2.f8216a;
/* 335 */           od2Var.m7138d(AbstractC0886en.m3507k("settings-", k61Var.f12615f), b21.f2178a.m1199b(StorageSettings.Companion.serializer(), storageSettings));
                }

                /* JADX INFO: renamed from: h */
                public final void m7636h(Map map) {
/* 1 */             map.getClass();
/* 4 */             od2 od2Var = this.f15353d;
/* 6 */             od2Var.getClass();
/* 11 */            SharedPreferences.Editor editorEdit = od2Var.f14716a.edit();
/* 27 */            for (Map.Entry entry : map.entrySet()) {
/* 35 */                Object value = entry.getValue();
/* 41 */                if (value instanceof String) {
/* 51 */                    editorEdit.putString((String) entry.getKey(), (String) value);
                        } else if (value instanceof Integer) {
/* 71 */                    editorEdit.putInt((String) entry.getKey(), ((Number) value).intValue());
                        }
                    }
/* 75 */            editorEdit.apply();
                }

                /* JADX INFO: renamed from: i */
                public final void m7637i(Set set) {
/* 1 */             fh2[] fh2VarArr = fh2.f8216a;
/* 3 */             r11 r11Var = b21.f2178a;
/* 5 */             C0168b5 c0168b5 = r11Var.f2163b;
/* 7 */             w21 w21Var = KTypeProjection.f12929c;
/* 11 */            js2 js2VarM5668b = j22.m5668b(StorageSessionEntry.class);
/* 15 */            w21Var.getClass();
/* 22 */            KTypeProjection kTypeProjection = new KTypeProjection(y21.f19457a, js2VarM5668b);
/* 25 */            k22 k22Var = j22.f12033a;
/* 29 */            C0857dv c0857dvM5667a = j22.m5667a(Set.class);
/* 33 */            List listSingletonList = Collections.singletonList(kTypeProjection);
/* 37 */            k22Var.getClass();
/* 57 */            this.f15354e.m7138d("session_buffer", r11Var.m1199b(jb1.m5766z(c0168b5, new js2(c0857dvM5667a, listSingletonList)), set));
                }
            }
