            package p000;

            import java.io.File;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class yh0 extends vh0 {

                /* JADX INFO: renamed from: b */
                public boolean f19634b;

                /* JADX INFO: renamed from: c */
                public File[] f19635c;

                /* JADX INFO: renamed from: d */
                public int f19636d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ zh0 f19637e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public yh0(zh0 zh0Var, File file) {
/* 6 */             super(file);
/* 1 */             file.getClass();
/* 4 */             this.f19637e = zh0Var;
                }

                @Override // p000.ai0
                /* JADX INFO: renamed from: a */
                public final File mo290a() {
                    Function2 function2;
/* 3 */             bi0 bi0Var = this.f19637e.f20148d;
/* 5 */             boolean z = this.f19634b;
/* 8 */             File file = this.f289a;
/* 10 */            if (z) {
/* 33 */                File[] fileArr = this.f19635c;
/* 35 */                if (fileArr == null || this.f19636d < fileArr.length) {
/* 51 */                    if (fileArr == null) {
/* 53 */                        File[] fileArrListFiles = file.listFiles();
/* 57 */                        this.f19635c = fileArrListFiles;
/* 59 */                        if (fileArrListFiles == null && (function2 = bi0Var.f2437e) != null) {
/* 69 */                            File file2 = this.f289a;
/* 77 */                            function2.invoke(file2, new C1984o0(file2, null, "Cannot list files in a directory", 2, null));
                                }
/* 80 */                        File[] fileArr2 = this.f19635c;
/* 82 */                        if (fileArr2 == null || fileArr2.length == 0) {
/* 87 */                            Function1 function1 = bi0Var.f2436d;
/* 89 */                            if (function1 != null) {
/* 91 */                                function1.invoke(file);
                                    }
                                }
                            }
/* 95 */                    File[] fileArr3 = this.f19635c;
/* 97 */                    fileArr3.getClass();
/* 100 */                   int i = this.f19636d;
/* 104 */                   this.f19636d = i + 1;
/* 106 */                   return fileArr3[i];
                        }
/* 43 */                Function1 function3 = bi0Var.f2436d;
/* 45 */                if (function3 != null) {
/* 47 */                    function3.invoke(file);
/* 7 */                     return null;
                        }
                    } else {
/* 12 */                Function1 function4 = bi0Var.f2435c;
/* 14 */                if (function4 == null || ((Boolean) function4.invoke(file)).booleanValue()) {
/* 30 */                    this.f19634b = true;
/* 32 */                    return file;
                        }
                    }
/* 7 */             return null;
                }
            }
