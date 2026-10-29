            package p000;

            import com.usercentrics.sdk.UsercentricsDomains;
            import com.usercentrics.sdk.p009v2.consent.data.ConsentStatusDto;
            import com.usercentrics.sdk.p009v2.consent.data.ConsentStringObject;
            import com.usercentrics.sdk.p009v2.consent.data.ConsentStringObjectDto;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObject;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObjectService;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObjectSettings;
            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsData;
            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsDto;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageVendor;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            import kotlin.Pair;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: mz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1945mz implements InterfaceC1811jz {

                /* JADX INFO: renamed from: a */
                public final x80 f14069a;

                /* JADX INFO: renamed from: b */
                public final i03 f14070b;

                /* JADX INFO: renamed from: c */
                public final m62 f14071c;

                /* JADX INFO: renamed from: d */
                public final g80 f14072d;

                /* JADX INFO: renamed from: e */
                public final pc2 f14073e;

                /* JADX INFO: renamed from: f */
                public final ac2 f14074f;

                public C1945mz(x80 x80Var, i03 i03Var, xq0 xq0Var, m62 m62Var, g80 g80Var, pc2 pc2Var, ac2 ac2Var) {
/* 1 */             x80Var.getClass();
/* 4 */             i03Var.getClass();
/* 7 */             g80Var.getClass();
/* 10 */            pc2Var.getClass();
/* 13 */            ac2Var.getClass();
/* 19 */            this.f14069a = x80Var;
/* 21 */            this.f14070b = i03Var;
/* 23 */            this.f14071c = m62Var;
/* 25 */            this.f14072d = g80Var;
/* 27 */            this.f14073e = pc2Var;
/* 29 */            this.f14074f = ac2Var;
                }

                /* JADX INFO: renamed from: a */
                public static final void m6831a(C1945mz c1945mz, SaveConsentsData saveConsentsData) {
                    String str;
                    String str2;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    ConsentStringObjectDto consentStringObjectDto;
/* 5 */             m62 m62Var = c1945mz.f14071c;
/* 11 */            boolean z4 = c1945mz.m6832b().f6725y;
/* 17 */            boolean z5 = c1945mz.m6832b().f6726z;
/* 23 */            boolean z6 = c1945mz.m6832b().f6698F;
/* 28 */            C1908lz c1908lz = new C1908lz(0, c1945mz, saveConsentsData);
/* 34 */            C1996oc c1996oc = new C1996oc(1, c1945mz, saveConsentsData);
/* 37 */            saveConsentsData.getClass();
/* 40 */            xu0 xu0Var = m62Var.f13601a;
/* 42 */            hb1 hb1Var = m62Var.f13602b;
/* 44 */            UsercentricsDomains usercentricsDomains = hb1Var.f8999b;
/* 50 */            if (usercentricsDomains.m2770a()) {
/* 52 */                str = usercentricsDomains.f6045d;
                    } else {
/* 57 */                int iOrdinal = hb1Var.f8998a.ordinal();
/* 61 */                if (iOrdinal == 0) {
/* 72 */                    str = "https://consent-api.service.consent.usercentrics.eu";
                        } else {
/* 63 */                    if (iOrdinal != 1) {
/* 68 */                        ds0.m3187b();
/* 71 */                        return;
                            }
/* 65 */                    str = "https://consent-api.service.consent.eu1.usercentrics.eu";
                        }
                    }
/* 76 */            String strM3783i = fm0.m3783i(str, "/consent/ua/3");
/* 86 */            e13 e13Var = (e13) m62Var.f13604d.getValue();
/* 88 */            ConsentStringObject consentStringObject = saveConsentsData.f6334b;
/* 90 */            DataTransferObject dataTransferObject = saveConsentsData.f6333a;
/* 92 */            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 94 */            if (consentStringObject == null || (str2 = consentStringObject.f6302a) == null) {
/* 100 */               str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 101 */           ConsentStringObjectDto.Companion companion = ConsentStringObjectDto.Companion;
/* 107 */           long j = dataTransferObject.f6320e * 1000;
/* 108 */           companion.getClass();
/* 111 */           if (consentStringObject == null) {
/* 113 */               consentStringObjectDto = null;
/* 114 */               z = z4;
/* 116 */               z2 = z5;
/* 118 */               z3 = z6;
                    } else {
/* 121 */               Map map = consentStringObject.f6303b;
/* 129 */               ArrayList arrayList = new ArrayList(map.size());
/* 144 */               for (Map.Entry entry : map.entrySet()) {
/* 198 */                   arrayList.add(C2085pw.m7566e(entry.getKey(), ((StorageVendor) entry.getValue()).f6149a, ((StorageVendor) entry.getValue()).f6150b, ((StorageVendor) entry.getValue()).f6151c));
/* 201 */                   z4 = z4;
/* 203 */                   z5 = z5;
/* 205 */                   z6 = z6;
                        }
/* 208 */               z = z4;
/* 210 */               z2 = z5;
/* 212 */               z3 = z6;
/* 216 */               consentStringObjectDto = new ConsentStringObjectDto(j, arrayList);
                    }
/* 231 */           String strM1199b = consentStringObjectDto == null ? HttpUrl.FRAGMENT_ENCODE_SET : b21.f2178a.m1199b(ConsentStringObjectDto.Companion.serializer(), consentStringObjectDto);
/* 240 */           String str4 = dataTransferObject.f6317b.f6322a.f13055a;
/* 243 */           String str5 = e13Var.f7479e;
/* 245 */           DataTransferObjectSettings dataTransferObjectSettings = dataTransferObject.f6318c;
/* 248 */           String str6 = dataTransferObjectSettings.f6330b;
/* 251 */           String str7 = dataTransferObjectSettings.f6331c;
/* 253 */           String str8 = dataTransferObjectSettings.f6329a;
/* 255 */           String str9 = dataTransferObjectSettings.f6332d;
/* 257 */           List list = dataTransferObject.f6319d;
/* 272 */           ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list, 10));
/* 275 */           Iterator it = list.iterator();
/* 283 */           while (it.hasNext()) {
/* 289 */               DataTransferObjectService dataTransferObjectService = (DataTransferObjectService) it.next();
/* 306 */               arrayList2.add(new ConsentStatusDto(dataTransferObjectService.f6324a, dataTransferObjectService.f6327d, dataTransferObjectService.f6326c));
/* 309 */               it = it;
/* 311 */               str4 = str4;
                    }
/* 316 */           String str10 = str4;
/* 318 */           String str11 = e13Var.f7477c;
/* 320 */           String str12 = e13Var.f7475a;
/* 322 */           String str13 = saveConsentsData.f6335c;
/* 324 */           if (str13 != null) {
/* 327 */               str3 = str13;
                    }
/* 357 */           String strM1199b2 = b21.f2178a.m1199b(SaveConsentsDto.Companion.serializer(), new SaveConsentsDto(str10, str5, str6, str7, str8, str9, str2, strM1199b, arrayList2, str11, str12, z2, z, str3, z3));
/* 367 */           Pair pair = new Pair("Accept", "application/json");
/* 376 */           Pair pair2 = new Pair("Access-Control-Allow-Origin", "*");
/* 383 */           String string = UUID.randomUUID().toString();
/* 387 */           string.getClass();
/* 401 */           Map mapM7131e = oc1.m7131e(pair, pair2, new Pair("X-Request-ID", string));
/* 409 */           C1983o c1983o = new C1983o(c1908lz, 15);
/* 412 */           xu0Var.getClass();
/* 426 */           C0875ec c0875ecM9743b = xu0Var.f19381c.m9743b(new C2283v7(xu0Var, strM3783i, strM1199b2, mapM7131e, (c10) null));
/* 437 */           c0875ecM9743b.m3370H(new C1983o(c1983o, 9));
/* 447 */           c0875ecM9743b.m3369G(new C1983o(c1996oc, 10));
                }

                /* JADX INFO: renamed from: b */
                public final UsercentricsSettings m6832b() {
                    UsercentricsSettings usercentricsSettings;
/* 3 */             kn1 kn1Var = this.f14073e.f15067d;
/* 5 */             if (kn1Var != null && (usercentricsSettings = kn1Var.f12892a) != null) {
/* 11 */                return usercentricsSettings;
                    }
/* 14 */            f42.m3656l("Consents Service requires a valid Settings state");
/* 17 */            return null;
                }
            }
