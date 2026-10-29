            package p000;

            import androidx.core.app.NotificationCompat;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentAction;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentHistory;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageConsentType;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageService;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageSettings;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.text.StringsKt;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class aj1 extends ui1 {
                @Override // p000.ui1
                /* JADX INFO: renamed from: a */
                public final void mo294a() {
/* 3 */             zi1[] zi1VarArr = zi1.f20159b;
/* 9 */             m295b("uc_ccpa", "ccpa_timestamp_millis");
/* 16 */            m295b("uc_session_timestamp", "session_timestamp");
/* 23 */            m295b("uc_consents_buffer", "consents_buffer");
/* 30 */            m295b("uc_tcf", "tcf");
/* 33 */            we2 we2Var = this.f17544a;
/* 44 */            String string = ((od2) we2Var.f18596c).f14716a.getString("uc_settings", null);
/* 48 */            if (string != null && !StringsKt.m6228D(string)) {
/* 70 */                C1859c c1859c = (C1859c) b21.f2178a.m1198a(string, C1859c.Companion.serializer());
/* 74 */                Object obj = c1859c.get("services");
/* 78 */                obj.getClass();
/* 83 */                C1857a c1857aM7600Z = py0.m7600Z((AbstractC1858b) obj);
/* 95 */                ArrayList arrayList = new ArrayList(C2122qw.m8020h(c1857aM7600Z, 10));
/* 100 */               Iterator it = c1857aM7600Z.f12963a.iterator();
/* 112 */               while (it.hasNext()) {
/* 120 */                   C1859c c1859cM7601a0 = py0.m7601a0((AbstractC1858b) it.next());
/* 128 */                   Object obj2 = c1859cM7601a0.get("history");
/* 132 */                   obj2.getClass();
/* 137 */                   C1857a c1857aM7600Z2 = py0.m7600Z((AbstractC1858b) obj2);
/* 147 */                   ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(c1857aM7600Z2, 10));
/* 152 */                   Iterator it2 = c1857aM7600Z2.f12963a.iterator();
/* 162 */                   while (it2.hasNext()) {
/* 170 */                       C1859c c1859cM7601a1 = py0.m7601a0((AbstractC1858b) it2.next());
/* 176 */                       Object obj3 = c1859cM7601a1.get("timestamp");
/* 180 */                       obj3.getClass();
/* 200 */                       long j = ((long) Double.parseDouble(py0.m7602b0((AbstractC1858b) obj3).mo6271a())) * 1000;
/* 204 */                       Object obj4 = c1859cM7601a1.get("action");
/* 208 */                       obj4.getClass();
/* 221 */                       kz2 kz2VarValueOf = kz2.valueOf(py0.m7602b0((AbstractC1858b) obj4).mo6271a());
/* 227 */                       Object obj5 = c1859cM7601a1.get("type");
/* 231 */                       obj5.getClass();
/* 244 */                       mz2 mz2VarValueOf = mz2.valueOf(py0.m7602b0((AbstractC1858b) obj5).mo6271a());
/* 252 */                       StorageConsentAction.Companion.getClass();
/* 255 */                       StorageConsentAction storageConsentActionM2780a = StorageConsentAction.Companion.m2780a(kz2VarValueOf);
/* 259 */                       Object obj6 = c1859cM7601a1.get(NotificationCompat.CATEGORY_STATUS);
/* 263 */                       obj6.getClass();
/* 272 */                       boolean zM7598W = py0.m7598W(py0.m7602b0((AbstractC1858b) obj6));
/* 278 */                       StorageConsentType.Companion.getClass();
/* 281 */                       StorageConsentType storageConsentTypeM2782a = StorageConsentType.Companion.m2782a(mz2VarValueOf);
/* 285 */                       Object obj7 = c1859cM7601a1.get("language");
/* 289 */                       obj7.getClass();
/* 307 */                       arrayList2.add(new StorageConsentHistory(storageConsentActionM2780a, zM7598W, storageConsentTypeM2782a, py0.m7602b0((AbstractC1858b) obj7).mo6271a(), j));
                            }
/* 312 */                   Object obj8 = c1859cM7601a0.get("id");
/* 316 */                   obj8.getClass();
/* 325 */                   String strMo6271a = py0.m7602b0((AbstractC1858b) obj8).mo6271a();
/* 331 */                   Object obj9 = c1859cM7601a0.get("processorId");
/* 335 */                   obj9.getClass();
/* 344 */                   String strMo6271a2 = py0.m7602b0((AbstractC1858b) obj9).mo6271a();
/* 348 */                   Object obj10 = c1859cM7601a0.get(NotificationCompat.CATEGORY_STATUS);
/* 352 */                   obj10.getClass();
/* 368 */                   arrayList.add(new StorageService(arrayList2, strMo6271a, strMo6271a2, py0.m7598W(py0.m7602b0((AbstractC1858b) obj10))));
                        }
/* 377 */               Object obj11 = c1859c.get("controllerId");
/* 381 */               obj11.getClass();
/* 390 */               String strMo6271a3 = py0.m7602b0((AbstractC1858b) obj11).mo6271a();
/* 394 */               Object obj12 = c1859c.get("id");
/* 398 */               obj12.getClass();
/* 407 */               String strMo6271a4 = py0.m7602b0((AbstractC1858b) obj12).mo6271a();
/* 411 */               Object obj13 = c1859c.get("language");
/* 415 */               obj13.getClass();
/* 424 */               String strMo6271a5 = py0.m7602b0((AbstractC1858b) obj13).mo6271a();
/* 430 */               Object obj14 = c1859c.get("version");
/* 434 */               obj14.getClass();
/* 447 */               StorageSettings storageSettings = new StorageSettings(strMo6271a3, strMo6271a4, strMo6271a5, arrayList, py0.m7602b0((AbstractC1858b) obj14).mo6271a());
/* 450 */               r11 r11Var = b21.f2178a;
/* 474 */               ((od2) we2Var.f18595b).m7138d("settings", r11Var.m1199b(jb1.m5766z(r11Var.f2163b, j22.m5668b(StorageSettings.class)), storageSettings));
                    }
/* 483 */           for (zi1 zi1Var : zi1.values()) {
/* 493 */               ((od2) we2Var.f18596c).m7135a(zi1Var.f20160a);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m295b(String str, String str2) {
/* 1 */             we2 we2Var = this.f17544a;
/* 10 */            String string = ((od2) we2Var.f18596c).f14716a.getString(str, null);
/* 14 */            if (string == null || !(!StringsKt.m6228D(string))) {
/* 31 */                return;
                    }
/* 28 */            ((od2) we2Var.f18595b).m7138d(str2, string);
                }
            }
