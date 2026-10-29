            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.os.IBinder;
            import android.view.Window;
            import android.view.WindowManager;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class he2 implements m73 {

                /* JADX INFO: renamed from: c */
                public static volatile he2 f9029c;

                /* JADX INFO: renamed from: d */
                public static final ReentrantLock f9030d = new ReentrantLock();

                /* JADX INFO: renamed from: a */
                public final ag0 f9031a;

                /* JADX INFO: renamed from: b */
                public final CopyOnWriteArrayList f9032b = new CopyOnWriteArrayList();

                public he2(fe2 fe2Var) {
/* 4 */             this.f9031a = fe2Var;
/* 13 */            if (fe2Var != null) {
/* 22 */                fe2Var.m3756d(new fs0(this, 14));
                    }
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
                @Override // p000.m73
                /* JADX INFO: renamed from: a */
                public final void mo4177a(Context context, qd1 qd1Var, dl0 dl0Var) {
                    Object next;
                    WindowManager.LayoutParams attributes;
/* 3 */             Unit unit = null;
/* 3 */             iBinder = null;
/* 3 */             IBinder iBinder = null;
/* 9 */             Activity activity = context instanceof Activity ? (Activity) context : null;
/* 10 */            if (activity != null) {
/* 12 */                ReentrantLock reentrantLock = f9030d;
/* 14 */                reentrantLock.lock();
                        try {
/* 17 */                    ag0 ag0Var = this.f9031a;
/* 19 */                    if (ag0Var == null) {
/* 28 */                        dl0Var.accept(new q83(nd0.f14189a));
/* 31 */                        reentrantLock.unlock();
/* 34 */                        return;
                            }
/* 38 */                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9032b;
/* 40 */                    boolean z = false;
/* 41 */                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
/* 50 */                        Iterator it = copyOnWriteArrayList.iterator();
/* 58 */                        while (it.hasNext()) {
/* 72 */                            if (((ge2) it.next()).f8570a.equals(activity)) {
/* 74 */                                z = true;
                                        break;
                                    }
                                }
                            }
/* 77 */                    ge2 ge2Var = new ge2(activity, qd1Var, dl0Var);
/* 80 */                    copyOnWriteArrayList.add(ge2Var);
/* 83 */                    if (z) {
/* 124 */                       Iterator it2 = copyOnWriteArrayList.iterator();
/* 147 */                       do {
/* 132 */                           if (!it2.hasNext()) {
/* 150 */                               next = null;
                                        break;
                                    }
/* 134 */                           next = it2.next();
/* 147 */                       } while (!activity.equals(((ge2) next).f8570a));
/* 151 */                       ge2 ge2Var2 = (ge2) next;
/* 155 */                       q83 q83Var = ge2Var2 != null ? ge2Var2.f8572c : null;
/* 157 */                       if (q83Var != null) {
/* 159 */                           ge2Var.f8572c = q83Var;
/* 163 */                           ge2Var.f8571b.accept(q83Var);
                                }
                            } else {
/* 85 */                        fe2 fe2Var = (fe2) ag0Var;
/* 87 */                        Window window = activity.getWindow();
/* 91 */                        if (window != null && (attributes = window.getAttributes()) != null) {
/* 99 */                            iBinder = attributes.token;
                                }
/* 101 */                       if (iBinder != null) {
/* 103 */                           fe2Var.m3755c(iBinder, activity);
                                } else {
/* 120 */                           activity.getWindow().getDecorView().addOnAttachStateChangeListener(new ee2(fe2Var, activity));
                                }
                            }
/* 166 */                   reentrantLock.unlock();
/* 169 */                   unit = Unit.f12910a;
                        } catch (Throwable th) {
/* 172 */                   reentrantLock.unlock();
/* 175 */                   throw th;
                        }
                    }
/* 176 */           if (unit == null) {
/* 185 */               dl0Var.accept(new q83(nd0.f14189a));
                    }
                }

                @Override // p000.m73
                /* JADX INFO: renamed from: b */
                public final void mo4178b(dl0 dl0Var) {
                    synchronized (f9030d) {
                        try {
/* 6 */                     if (this.f9031a == null) {
/* 9 */                         return;
                            }
/* 12 */                    ArrayList arrayList = new ArrayList();
/* 25 */                    for (ge2 ge2Var : this.f9032b) {
/* 35 */                        if (ge2Var.f8571b == dl0Var) {
/* 37 */                            arrayList.add(ge2Var);
                                }
                            }
/* 45 */                    this.f9032b.removeAll(arrayList);
/* 48 */                    Iterator it = arrayList.iterator();
/* 56 */                    while (it.hasNext()) {
/* 64 */                        Activity activity = ((ge2) it.next()).f8570a;
/* 66 */                        CopyOnWriteArrayList copyOnWriteArrayList = this.f9032b;
/* 68 */                        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
/* 77 */                            Iterator it2 = copyOnWriteArrayList.iterator();
                                    while (true) {
/* 85 */                                if (it2.hasNext()) {
/* 99 */                                    if (((ge2) it2.next()).f8570a.equals(activity)) {
                                            }
                                        }
                                    }
                                }
/* 102 */                       ag0 ag0Var = this.f9031a;
/* 104 */                       if (ag0Var != null) {
/* 108 */                           ((fe2) ag0Var).m3754b(activity);
                                }
                            }
                        } catch (Throwable th) {
/* 115 */                   throw th;
                        }
                    }
                }
            }
