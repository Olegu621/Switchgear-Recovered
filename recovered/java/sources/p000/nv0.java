            package p000;

            import android.util.Size;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nv0 {

                /* JADX INFO: renamed from: a */
                public static final tv0 f14464a;

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
                static {
/* 7 */             Object size = new Size(640, 480);
/* 10 */            xt0 xt0Var = xt0.f19361b;
/* 14 */            Size size2 = ue2.f17490b;
/* 16 */            r32 r32Var = new r32();
/* 19 */            r32Var.f15844a = size2;
/* 22 */            r32Var.f15845b = 1;
/* 26 */            Object q32Var = new q32(xt0Var, r32Var);
/* 31 */            C1974nr c1974nr = new C1974nr(1);
/* 34 */            C1888lf c1888lf = jw0.f12524x;
/* 36 */            uk1 uk1Var = c1974nr.f14413b;
/* 38 */            uk1Var.m9037p(c1888lf, size);
/* 47 */            uk1Var.m9037p(zy2.f20388K, 1);
/* 57 */            uk1Var.m9037p(jw0.f12519q, 0);
/* 62 */            uk1Var.m9037p(jw0.f12517A, q32Var);
/* 65 */            mb0 mb0Var = mb0.f13671d;
/* 71 */            if (!mb0Var.equals(mb0Var)) {
/* 92 */                C1951n4.m6866q("ImageAnalysis currently only supports SDR");
                    } else {
/* 75 */                uk1Var.m9037p(hw0.f9339p, mb0Var);
/* 87 */                f14464a = new tv0(nq1.m7021d(uk1Var));
                    }
                }
            }
