            package p000;

            import com.supercell.p007id.scid_plugin.EncryptedStorage;
            import com.supercell.p007id.scid_plugin.MobileScanner;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataWhitelist;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import com.usercentrics.sdk.p009v2.consent.data.ConsentStringObject;
            import com.usercentrics.sdk.p009v2.consent.data.DataTransferObject;
            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsData;
            import com.usercentrics.sdk.p009v2.settings.data.ConsentDisclosureObject;
            import com.usercentrics.sdk.p009v2.settings.data.UsercentricsSettings;
            import com.usercentrics.sdk.services.deviceStorage.models.StorageTCF;
            import com.usercentrics.tcf.core.model.gvl.Declarations;
            import com.usercentrics.tcf.core.model.gvl.VendorList;
            import java.io.IOException;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: qh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C2107qh extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15541a;

                /* JADX INFO: renamed from: b */
                public /* synthetic */ Object f15542b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15543c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2107qh(Object obj, Object obj2, c10 c10Var, int i) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f15541a = i;
/* 3 */             this.f15542b = obj;
/* 5 */             this.f15543c = obj2;
                }

                /* JADX INFO: renamed from: e */
                private final Object m7803e(Object obj) {
                    SaveConsentsData saveConsentsData;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 8 */             C1945mz c1945mz = (C1945mz) this.f15542b;
/* 13 */            kz2 kz2Var = (kz2) this.f15543c;
/* 15 */            ac2 ac2Var = c1945mz.f14074f;
/* 19 */            ConsentStringObject consentStringObject = null;
/* 20 */            if (kz2Var == kz2.TCF_STRING_CHANGE) {
/* 38 */                DataTransferObject dataTransferObjectM2817a = DataTransferObject.Companion.m2817a(DataTransferObject.Companion, c1945mz.m6832b(), ac2Var.f182c.f12614e, nd0.f14189a, kz2Var, kz2Var.m6318a());
/* 44 */                pz2 pz2Var = (pz2) c1945mz.f14072d;
/* 46 */                od2 od2Var = pz2Var.f15353d;
/* 48 */                av0 av0Var = bv0.Companion;
/* 50 */                od2Var.getClass();
/* 57 */                String string = od2Var.f14716a.getString("IABTCF_AddtlConsent", null);
/* 61 */                String str = HttpUrl.FRAGMENT_ENCODE_SET;
/* 63 */                if (string == null) {
/* 65 */                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 68 */                StorageTCF storageTCF = pz2Var.f15356g;
/* 70 */                String str2 = storageTCF.f6145a;
/* 76 */                if (StringsKt.m6228D(str2)) {
/* 86 */                    od2 od2Var2 = pz2Var.f15353d;
/* 88 */                    od2Var2.getClass();
/* 95 */                    String string2 = od2Var2.f14716a.getString("IABUSPrivacy_String", null);
/* 99 */                    if (string2 != null) {
/* 102 */                       str = string2;
                            }
/* 107 */                   if (!StringsKt.m6228D(str)) {
/* 111 */                       od0 od0Var = od0.f14715a;
/* 113 */                       od0Var.getClass();
/* 116 */                       consentStringObject = new ConsentStringObject(str, od0Var);
                            }
                        } else {
/* 82 */                    consentStringObject = new ConsentStringObject(str2, storageTCF.f6146b);
                        }
/* 119 */               saveConsentsData = new SaveConsentsData(dataTransferObjectM2817a, consentStringObject, string);
                    } else {
/* 123 */               DataTransferObject.Companion companion = DataTransferObject.Companion;
/* 125 */               UsercentricsSettings usercentricsSettingsM6832b = c1945mz.m6832b();
/* 129 */               k61 k61Var = ac2Var.f182c;
/* 145 */               saveConsentsData = new SaveConsentsData(DataTransferObject.Companion.m2817a(companion, usercentricsSettingsM6832b, k61Var.f12614e, k61Var.f12611b, kz2Var, kz2Var.m6318a()), null, null);
                    }
/* 148 */           C1945mz.m6831a(c1945mz, saveConsentsData);
/* 151 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: g */
                private final Object m7804g(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 8 */             j10 j10Var = (j10) this.f15542b;
/* 10 */            gl2 gl2Var = j10Var.f11989b;
/* 12 */            VendorList vendorList = gl2Var.f8701c;
/* 14 */            vendorList.getClass();
/* 17 */            Declarations declarations = gl2Var.f8702d;
/* 24 */            Map map = declarations != null ? declarations.f6802a : vendorList.f6857f;
/* 26 */            gr0 gr0Var = j10Var.f11990c;
/* 30 */            String str = (String) this.f15543c;
/* 32 */            str.getClass();
/* 47 */            String str2 = ((xu0) ((d52) gr0Var.f8789a).f7001a).m10030b(str).f20332b;
/* 49 */            r11 r11Var = b21.f2178a;
/* 67 */            ConsentDisclosureObject consentDisclosureObject = (ConsentDisclosureObject) r11Var.m1198a(str2, jb1.m5766z(r11Var.f2163b, j22.m5668b(ConsentDisclosureObject.class)));
/* 71 */            hu1 hu1VarMo5633b = j10Var.mo5633b();
/* 75 */            hu1VarMo5633b.getClass();
/* 78 */            if (map == null) {
/* 80 */                map = od0.f14715a;
/* 82 */                map.getClass();
                    }
/* 88 */            return new C0875ec(consentDisclosureObject, hu1VarMo5633b, map).m3367E();
                }

                /* JADX INFO: renamed from: h */
                private final Object m7805h(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 14 */            return ((xu0) this.f15542b).m10030b((String) this.f15543c);
                }

                /* JADX INFO: renamed from: i */
                private final Object m7806i(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 11 */            throw null;
                }

                /* JADX INFO: renamed from: j */
                private final Object m7807j(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 1 */             Function1 function1 = ((MobileScanner) this.f15542b).mobileScannerCallback;
/* 16 */            String str = (String) this.f15543c;
/* 18 */            str.getClass();
/* 21 */            function1.invoke(str);
/* 24 */            return Unit.f12910a;
                }

                /* JADX INFO: renamed from: k */
                private final Object m7808k(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 10 */            gj1 gj1Var = ((fj1) this.f15542b).f8238d;
/* 14 */            String str = (String) this.f15543c;
/* 16 */            str.getClass();
/* 19 */            gj1Var.invoke(str);
/* 22 */            return Unit.f12910a;
                }

                /* JADX INFO: renamed from: l */
                private final Object m7809l(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 1 */             Function1 function1 = ((MobileScanner) this.f15542b).mobileScannerErrorCallback;
/* 16 */            Exception exc = (Exception) this.f15543c;
/* 18 */            String localizedMessage = exc.getLocalizedMessage();
/* 22 */            if (localizedMessage == null) {
/* 24 */                localizedMessage = exc.toString();
                    }
/* 28 */            function1.invoke(localizedMessage);
/* 31 */            return Unit.f12910a;
                }

                /* JADX INFO: renamed from: m */
                private final Object m7810m(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 10 */            gj1 gj1Var = ((fj1) this.f15542b).f8239e;
/* 14 */            Exception exc = (Exception) this.f15543c;
/* 16 */            String localizedMessage = exc.getLocalizedMessage();
/* 20 */            if (localizedMessage == null) {
/* 22 */                localizedMessage = exc.toString();
                    }
/* 26 */            gj1Var.invoke(localizedMessage);
/* 29 */            return Unit.f12910a;
                }

                /* JADX INFO: renamed from: n */
                private final Object m7811n(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 10 */            String string = ((JSONObject) this.f15542b).toString();
/* 14 */            string.getClass();
/* 1 */             EncryptedStorage encryptedStorage = ((SharedDataWhitelist) this.f15543c).encryptedStorage;
/* 25 */            if (encryptedStorage == null) {
/* 35 */                return null;
                    }
/* 29 */            encryptedStorage.put("whitelist", string);
/* 32 */            return Unit.f12910a;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f15541a;
/* 3 */             Object obj2 = this.f15543c;
                    switch (i) {
                        case 0:
/* 160 */                   return new C2107qh((C2218th) this.f15542b, (k61) obj2, c10Var, 0);
                        case 1:
/* 147 */                   return new C2107qh((C1945mz) this.f15542b, (kz2) obj2, c10Var, 1);
                        case 2:
/* 134 */                   return new C2107qh((j10) this.f15542b, (String) obj2, c10Var, 2);
                        case 3:
/* 119 */                   C2107qh c2107qh = new C2107qh((og2) obj2, c10Var, 3);
/* 122 */                   c2107qh.f15542b = obj;
/* 124 */                   return c2107qh;
                        case 4:
/* 110 */                   return new C2107qh((xu0) this.f15542b, (String) obj2, c10Var, 4);
                        case 5:
/* 95 */                    C2107qh c2107qh2 = new C2107qh((rd1) obj2, c10Var, 5);
/* 98 */                    c2107qh2.f15542b = obj;
/* 100 */                   return c2107qh2;
                        case 6:
/* 86 */                    return new C2107qh((fj1) this.f15542b, (String) obj2, c10Var, 6);
                        case 7:
/* 73 */                    return new C2107qh((MobileScanner) this.f15542b, (String) obj2, c10Var, 7);
                        case 8:
/* 60 */                    return new C2107qh((fj1) this.f15542b, (Exception) obj2, c10Var, 8);
                        case 9:
/* 46 */                    return new C2107qh((MobileScanner) this.f15542b, (Exception) obj2, c10Var, 9);
                        case 10:
/* 32 */                    return new C2107qh((JSONObject) this.f15542b, (SharedDataWhitelist) obj2, c10Var, 10);
                        default:
/* 18 */                    return new C2107qh((UCImageView) this.f15542b, (String) obj2, c10Var, 11);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws IOException {
                    switch (this.f15541a) {
                        case 0:
/* 205 */                   return ((C2107qh) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 188 */                   return ((C2107qh) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 2:
/* 171 */                   return ((C2107qh) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 3:
/* 154 */                   return ((C2107qh) create((og2) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 4:
/* 137 */                   return ((C2107qh) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 5:
/* 120 */                   ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
/* 124 */                   throw null;
                        case 6:
/* 103 */                   return ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 7:
/* 86 */                    return ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 8:
/* 69 */                    return ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 9:
/* 52 */                    return ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 10:
/* 35 */                    return ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((C2107qh) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v42, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v87, types: [nd0] */
                /* JADX WARN: Type inference failed for: r11v72 */
                /* JADX WARN: Type inference failed for: r11v73 */
                /* JADX WARN: Type inference failed for: r12v19, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r12v22, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r12v54, types: [nd0] */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 ac1, still in use, count: 2, list:
                      (r0v14 ac1) from 0x0759: PHI (r0v15 ac1) = (r0v14 ac1), (r0v25 ac1) binds: [B:291:0x073f, B:294:0x075f] A[DONT_GENERATE, DONT_INLINE]
                      (r0v14 ac1) from 0x0735: MOVE (r20v6 ac1) = (r0v14 ac1) (LINE:1846)
                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                    	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                    	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                    */
                @Override // p000.AbstractC0181bi
                public final java.lang.Object invokeSuspend(java.lang.Object r73) throws java.io.IOException {
                    /*
                        Method dump skipped, instruction units count: 3752
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.C2107qh.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public /* synthetic */ C2107qh(Object obj, c10 c10Var, int i) {
                    super(2, c10Var);
/* 12 */            this.f15541a = i;
                    this.f15543c = obj;
                }
            }
