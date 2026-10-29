            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qp1 implements d71, InterfaceC0817cr {

                /* JADX INFO: renamed from: a */
                public final v61 f15682a;

                /* JADX INFO: renamed from: b */
                public final kp1 f15683b;

                /* JADX INFO: renamed from: c */
                public rp1 f15684c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ sp1 f15685d;

                public qp1(sp1 sp1Var, v61 v61Var, kp1 kp1Var) {
/* 4 */             kp1Var.getClass();
/* 7 */             this.f15685d = sp1Var;
/* 9 */             this.f15682a = v61Var;
/* 11 */            this.f15683b = kp1Var;
/* 13 */            v61Var.mo4483a(this);
                }

                @Override // p000.InterfaceC0817cr
                public final void cancel() {
/* 3 */             this.f15682a.mo4484b(this);
/* 8 */             this.f15683b.removeCancellable(this);
/* 11 */            rp1 rp1Var = this.f15684c;
/* 13 */            if (rp1Var != null) {
/* 15 */                rp1Var.cancel();
                    }
/* 19 */            this.f15684c = null;
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
                @Override // p000.d71
                public final void onStateChanged(g71 g71Var, t61 t61Var) {
/* 3 */             if (t61Var != t61.ON_START) {
/* 53 */                if (t61Var != t61.ON_STOP) {
/* 65 */                    if (t61Var == t61.ON_DESTROY) {
/* 67 */                        cancel();
/* 70 */                        return;
                            }
/* 70 */                    return;
                        } else {
/* 55 */                    rp1 rp1Var = this.f15684c;
/* 57 */                    if (rp1Var != null) {
/* 59 */                        rp1Var.cancel();
/* 62 */                        return;
                            }
/* 70 */                    return;
                        }
                    }
/* 5 */             sp1 sp1Var = this.f15685d;
/* 7 */             sp1Var.getClass();
/* 10 */            kp1 kp1Var = this.f15683b;
/* 12 */            kp1Var.getClass();
/* 17 */            sp1Var.f16739b.addLast(kp1Var);
/* 22 */            rp1 rp1Var2 = new rp1(sp1Var, kp1Var);
/* 25 */            kp1Var.addCancellable(rp1Var2);
/* 28 */            sp1Var.m8604d();
/* 45 */            kp1Var.setEnabledChangedCallback$activity_release(new v11(0, sp1Var, sp1.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3));
/* 48 */            this.f15684c = rp1Var2;
                }
            }
