            package p000;

            import androidx.core.app.NotificationCompat;
            import java.util.HashMap;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class tq2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17228a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ uq2 f17229b;

                public /* synthetic */ tq2(uq2 uq2Var, int i) {
/* 1 */             this.f17228a = i;
/* 3 */             this.f17229b = uq2Var;
                }

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
                /* JADX INFO: renamed from: a */
                public final void m8862a(HashMap map) {
                    boolean zBooleanValue;
                    boolean z;
                    switch (this.f17228a) {
                        case 0:
/* 284 */                   uq2 uq2Var = this.f17229b;
/* 288 */                   if (uq2Var.f17662p) {
/* 290 */                       Object obj = map.get(NotificationCompat.CATEGORY_EVENT);
/* 299 */                       AbstractC1812k abstractC1812k = obj instanceof AbstractC1812k ? (AbstractC1812k) obj : null;
/* 301 */                       if (abstractC1812k != null) {
/* 303 */                           uq2Var.m9121c(abstractC1812k);
                                }
                            }
                            break;
                        case 1:
/* 261 */                   uq2 uq2Var2 = this.f17229b;
/* 265 */                   if (uq2Var2.f17663q) {
/* 267 */                       Object obj2 = map.get(NotificationCompat.CATEGORY_EVENT);
/* 276 */                       AbstractC1812k abstractC1812k2 = obj2 instanceof AbstractC1812k ? (AbstractC1812k) obj2 : null;
/* 278 */                       if (abstractC1812k2 != null) {
/* 280 */                           uq2Var2.m9121c(abstractC1812k2);
                                }
                            }
                            break;
                        case 2:
/* 238 */                   uq2 uq2Var3 = this.f17229b;
/* 242 */                   if (uq2Var3.f17665s) {
/* 244 */                       Object obj3 = map.get(NotificationCompat.CATEGORY_EVENT);
/* 253 */                       AbstractC1812k abstractC1812k3 = obj3 instanceof AbstractC1812k ? (AbstractC1812k) obj3 : null;
/* 255 */                       if (abstractC1812k3 != null) {
/* 257 */                           uq2Var3.m9121c(abstractC1812k3);
                                }
                            }
                            break;
                        case 3:
/* 89 */                    uq2 uq2Var4 = this.f17229b;
/* 91 */                    za2 za2Var = uq2Var4.f17657k;
/* 93 */                    if (za2Var != null && uq2Var4.f17664r) {
/* 103 */                       Object obj4 = map.get("isForeground");
/* 112 */                       Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
/* 114 */                       if (bool != null && za2Var.f20043f.get() != (z = !(zBooleanValue = bool.booleanValue()))) {
/* 131 */                           uq2 uq2Var5 = this.f17229b;
/* 133 */                           if (zBooleanValue) {
/* 137 */                               xl0 xl0Var = new xl0();
/* 148 */                               xl0Var.f19244b = Integer.valueOf(za2Var.f20041d + 1);
/* 150 */                               uq2Var5.m9121c(xl0Var);
                                    } else {
/* 156 */                               C0991hh c0991hh = new C0991hh();
/* 167 */                               c0991hh.f9076b = Integer.valueOf(za2Var.f20040c + 1);
/* 169 */                               uq2Var5.m9121c(c0991hh);
                                    }
/* 178 */                           if (za2Var.f20043f.compareAndSet(zBooleanValue, z)) {
/* 184 */                               if (!zBooleanValue) {
/* 223 */                                   k50.m5968e("za2", "Application moved to background", new Object[0]);
/* 228 */                                   za2.m10299a(za2Var.f20050m);
/* 235 */                                   za2Var.f20040c++;
                                        } else {
/* 190 */                                   k50.m5968e("za2", "Application moved to foreground", new Object[0]);
/* 195 */                                   za2.m10299a(za2Var.f20049l);
                                            try {
/* 198 */                                       za2Var.m10301c(false);
                                            } catch (Exception e) {
/* 209 */                                       k50.m5980q("za2", "Could not resume checking as tracker not setup. Exception: %s", e);
                                            }
/* 216 */                                   za2Var.f20041d++;
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        default:
/* 9 */                     uq2 uq2Var6 = this.f17229b;
/* 13 */                    if (uq2Var6.f17666t) {
/* 15 */                        Object obj5 = map.get(NotificationCompat.CATEGORY_EVENT);
/* 26 */                        v72 v72Var = obj5 instanceof v72 ? (v72) obj5 : null;
/* 27 */                        if (v72Var != null) {
/* 37 */                            ng2 ng2VarM3821r = ((fs0) uq2Var6.f17651e.f7991i).m3821r("ScreenContext");
/* 46 */                            t72 t72Var = ng2VarM3821r instanceof t72 ? (t72) ng2VarM3821r : null;
/* 48 */                            if (t72Var == null) {
/* 85 */                                uq2Var6.m9121c(v72Var);
                                    } else {
/* 50 */                                String str = v72Var.f17904i;
/* 52 */                                if (str == null || str.length() == 0 || !Intrinsics.m6216a(v72Var.f17904i, t72Var.f16951d) || !Intrinsics.m6216a(v72Var.f17905j, t72Var.f16952e)) {
/* 81 */                                    uq2Var6.m9121c(v72Var);
                                        }
                                    }
                                }
                            }
                            break;
                    }
                }
            }
