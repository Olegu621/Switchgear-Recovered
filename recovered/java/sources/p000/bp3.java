            package p000;

            import java.nio.charset.StandardCharsets;
            import java.util.ArrayList;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class bp3 implements yh3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2563a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f2564b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ mp3 f2565c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f2566d;

                public /* synthetic */ bp3(mp3 mp3Var, String str, Object obj, int i) {
/* 1 */             this.f2563a = i;
/* 3 */             this.f2564b = str;
/* 5 */             this.f2566d = obj;
/* 7 */             this.f2565c = mp3Var;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x002e A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x001a, B:22:0x0067, B:25:0x008b, B:16:0x002e, B:18:0x0054, B:20:0x005f, B:21:0x0063), top: B:32:0x001a }] */
                /* JADX WARN: Code duplicated, block: B:18:0x0054 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x001a, B:22:0x0067, B:25:0x008b, B:16:0x002e, B:18:0x0054, B:20:0x005f, B:21:0x0063), top: B:32:0x001a }] */
                /* JADX WARN: Code duplicated, block: B:20:0x005f A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x001a, B:22:0x0067, B:25:0x008b, B:16:0x002e, B:18:0x0054, B:20:0x005f, B:21:0x0063), top: B:32:0x001a }] */
                /* JADX WARN: Code duplicated, block: B:21:0x0063 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:6:0x001a, B:22:0x0067, B:25:0x008b, B:16:0x002e, B:18:0x0054, B:20:0x005f, B:21:0x0063), top: B:32:0x001a }] */
                /* JADX WARN: Code duplicated, block: B:22:0x0067 A[Catch: all -> 0x001d, PHI: r9
  0x0067: PHI (r9v7 int) = (r9v1 int), (r9v0 int) binds: [B:15:0x002c, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x001d, blocks: (B:6:0x001a, B:22:0x0067, B:25:0x008b, B:16:0x002e, B:18:0x0054, B:20:0x005f, B:21:0x0063), top: B:32:0x001a }] */
                /* JADX WARN: Code duplicated, block: B:24:0x008a  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // p000.yh3
                /* JADX INFO: renamed from: a */
                public final void mo1405a(String str, int i, Throwable th, byte[] bArr, Map map) {
                    ci3 ci3Var;
                    ae3 ae3Var;
                    String strSubstring;
                    Object obj;
/* 1 */             int i2 = this.f2563a;
/* 3 */             Object obj2 = this.f2566d;
                    switch (i2) {
                        case 0:
/* 181 */                   this.f2565c.m6783x(true, i, th, bArr, this.f2564b, (ArrayList) obj2);
/* 184 */                   return;
                        default:
/* 10 */                    long j = ((pp3) obj2).f15234a;
/* 12 */                    mp3 mp3Var = this.f2565c;
/* 18 */                    mp3Var.mo4558b().mo1375y();
/* 21 */                    mp3Var.m6765k0();
/* 25 */                    if (bArr == null) {
                                try {
/* 27 */                            bArr = new byte[0];
                                } finally {
/* 164 */                           mp3Var.f13920f0 = false;
/* 166 */                           mp3Var.m6740M();
                                }
                            }
/* 36 */                    String str2 = this.f2564b;
/* 38 */                    if (i == 200) {
/* 45 */                        if (th == null) {
/* 47 */                            ae3 ae3Var2 = mp3Var.f13913c;
/* 49 */                            mp3.m6728S(ae3Var2);
/* 56 */                            ae3Var2.m224G(Long.valueOf(j));
/* 71 */                            mp3Var.mo4557a().f17534Y.m8512c(str2, "Successfully uploaded batch from upload queue. appId, status", Integer.valueOf(i));
/* 74 */                            ci3Var = mp3Var.f13911b;
/* 76 */                            mp3.m6728S(ci3Var);
/* 83 */                            if (ci3Var.m1683T()) {
/* 85 */                                ae3Var = mp3Var.f13913c;
/* 87 */                                mp3.m6728S(ae3Var);
/* 94 */                                if (ae3Var.m222F(str2)) {
/* 96 */                                    mp3Var.m6779t(str2);
                                        } else {
/* 100 */                                   mp3Var.m6739L();
                                        }
                                    } else {
/* 100 */                               mp3Var.m6739L();
                                    }
                                } else {
/* 108 */                           String str3 = new String(bArr, StandardCharsets.UTF_8);
/* 121 */                           strSubstring = str3.substring(0, Math.min(32, str3.length()));
/* 129 */                           sh3 sh3Var = mp3Var.mo4557a().f17531V;
/* 133 */                           Integer numValueOf = Integer.valueOf(i);
                                    obj = th;
/* 137 */                           if (th == null) {
/* 139 */                               obj = strSubstring;
                                    }
/* 140 */                           sh3Var.m8513d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
/* 143 */                           ae3 ae3Var3 = mp3Var.f13913c;
/* 145 */                           mp3.m6728S(ae3Var3);
/* 152 */                           ae3Var3.m232L(Long.valueOf(j));
/* 155 */                           mp3Var.m6739L();
                                }
                            } else if (i == 204) {
/* 44 */                        i = 204;
/* 45 */                        if (th == null) {
/* 47 */                            ae3 ae3Var4 = mp3Var.f13913c;
/* 49 */                            mp3.m6728S(ae3Var4);
/* 56 */                            ae3Var4.m224G(Long.valueOf(j));
/* 71 */                            mp3Var.mo4557a().f17534Y.m8512c(str2, "Successfully uploaded batch from upload queue. appId, status", Integer.valueOf(i));
/* 74 */                            ci3Var = mp3Var.f13911b;
/* 76 */                            mp3.m6728S(ci3Var);
/* 83 */                            if (ci3Var.m1683T()) {
/* 85 */                                ae3Var = mp3Var.f13913c;
/* 87 */                                mp3.m6728S(ae3Var);
/* 94 */                                if (ae3Var.m222F(str2)) {
/* 96 */                                    mp3Var.m6779t(str2);
                                        } else {
/* 100 */                                   mp3Var.m6739L();
                                        }
                                    } else {
/* 100 */                               mp3Var.m6739L();
                                    }
                                } else {
/* 108 */                           String str4 = new String(bArr, StandardCharsets.UTF_8);
/* 121 */                           strSubstring = str4.substring(0, Math.min(32, str4.length()));
/* 129 */                           sh3 sh3Var2 = mp3Var.mo4557a().f17531V;
/* 133 */                           Integer numValueOf2 = Integer.valueOf(i);
                                    obj = th;
/* 137 */                           if (th == null) {
/* 139 */                               obj = strSubstring;
                                    }
/* 140 */                           sh3Var2.m8513d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
/* 143 */                           ae3 ae3Var5 = mp3Var.f13913c;
/* 145 */                           mp3.m6728S(ae3Var5);
/* 152 */                           ae3Var5.m232L(Long.valueOf(j));
/* 155 */                           mp3Var.m6739L();
                                }
                            } else {
/* 108 */                       String str5 = new String(bArr, StandardCharsets.UTF_8);
/* 121 */                       strSubstring = str5.substring(0, Math.min(32, str5.length()));
/* 129 */                       sh3 sh3Var3 = mp3Var.mo4557a().f17531V;
/* 133 */                       Integer numValueOf3 = Integer.valueOf(i);
                                obj = th;
/* 137 */                       if (th == null) {
/* 139 */                           obj = strSubstring;
                                }
/* 140 */                       sh3Var3.m8513d("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
/* 143 */                       ae3 ae3Var6 = mp3Var.f13913c;
/* 145 */                       mp3.m6728S(ae3Var6);
/* 152 */                       ae3Var6.m232L(Long.valueOf(j));
/* 155 */                       mp3Var.m6739L();
                            }
/* 163 */                   return;
                    }
                }
            }
