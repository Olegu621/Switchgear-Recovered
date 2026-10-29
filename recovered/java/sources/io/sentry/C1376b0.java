            package io.sentry;

            import io.sentry.hints.InterfaceC1478f;
            import io.sentry.hints.InterfaceC1480h;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import java.io.BufferedInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            
            /* JADX INFO: renamed from: io.sentry.b0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1376b0 extends AbstractC1733w {

                /* JADX INFO: renamed from: e */
                public final InterfaceC1389c1 f10712e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC1487i1 f10713f;

                /* JADX INFO: renamed from: g */
                public final ILogger f10714g;

                public C1376b0(InterfaceC1389c1 interfaceC1389c1, InterfaceC1487i1 interfaceC1487i1, ILogger iLogger, long j, int i) {
/* 6 */             super(interfaceC1389c1, iLogger, j, i);
/* 11 */            AbstractC1704c.m5462q(interfaceC1389c1, "Scopes are required.");
/* 14 */            this.f10712e = interfaceC1389c1;
/* 18 */            AbstractC1704c.m5462q(interfaceC1487i1, "Serializer is required.");
/* 21 */            this.f10713f = interfaceC1487i1;
/* 25 */            AbstractC1704c.m5462q(iLogger, "Logger is required.");
/* 28 */            this.f10714g = iLogger;
                }

                /* JADX INFO: renamed from: c */
                public static void m5056c(C1376b0 c1376b0, File file, InterfaceC1480h interfaceC1480h) {
/* 1 */             boolean zMo4952a = interfaceC1480h.mo4952a();
/* 5 */             ILogger iLogger = c1376b0.f10714g;
/* 7 */             if (zMo4952a) {
/* 75 */                iLogger.mo4672k(EnumC1553m5.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
/* 78 */                return;
                    }
                    try {
/* 17 */                if (!file.delete()) {
/* 29 */                    iLogger.mo4672k(EnumC1553m5.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
                        }
                    } catch (Throwable th) {
/* 44 */                iLogger.mo4670b(EnumC1553m5.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
                    }
/* 59 */            iLogger.mo4672k(EnumC1553m5.DEBUG, "Deleted file %s.", file.getAbsolutePath());
                }

                @Override // io.sentry.AbstractC1733w
                /* JADX INFO: renamed from: a */
                public final boolean mo5057a(String str) {
/* 3 */             return str.endsWith(".envelope");
                }

                /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
                
                    if (r2 != null) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0117, code lost:
                
                    m5056c(r8, r9, (io.sentry.hints.InterfaceC1480h) r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
                
                    if (r2 != null) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0160, code lost:
                
                    if (r2 != null) goto L56;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
                
                    return;
                 */
                /* JADX WARN: Undo finally extract visitor
                java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
                	at jadx.core.utils.Pair.hashCode(Pair.java:35)
                	at java.base/java.util.HashMap.hash(Unknown Source)
                	at java.base/java.util.HashMap.getNode(Unknown Source)
                	at java.base/java.util.HashMap.containsKey(Unknown Source)
                	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
                	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
                	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
                	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
                	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
                	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
                	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
                	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
                	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
                	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
                 */
                @Override // io.sentry.AbstractC1733w
                /* JADX INFO: renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void mo5058b(File file, C1486i0 c1486i0) {
                    Object objM5273b;
/* 5 */             boolean zIsFile = file.isFile();
/* 9 */             ILogger iLogger = this.f10714g;
/* 11 */            if (!zIsFile) {
/* 25 */                iLogger.mo4672k(EnumC1553m5.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
/* 28 */                return;
                    }
/* 39 */            if (!file.getName().endsWith(".envelope")) {
/* 53 */                iLogger.mo4672k(EnumC1553m5.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
/* 56 */                return;
                    }
/* 65 */            if (!file.getParentFile().canWrite()) {
/* 79 */                iLogger.mo4672k(EnumC1553m5.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
/* 82 */                return;
                    }
                    try {
                        try {
                            try {
/* 91 */                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                try {
/* 96 */                            C1505c c1505cMo5065c = this.f10713f.mo5065c(bufferedInputStream);
/* 100 */                           if (c1505cMo5065c == null) {
/* 114 */                               iLogger.mo4672k(EnumC1553m5.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                                    } else {
/* 122 */                               this.f10712e.mo5088h(c1505cMo5065c, c1486i0);
                                    }
/* 127 */                           Object objM5273b2 = c1486i0.m5273b("sentry:typeCheckHint");
/* 139 */                           if (!InterfaceC1478f.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b2 == null) {
/* 161 */                               AbstractC1704c.m5458m(InterfaceC1478f.class, objM5273b2, iLogger);
                                    } else if (!((InterfaceC1478f) objM5273b2).mo4955d()) {
/* 157 */                               iLogger.mo4672k(EnumC1553m5.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                                    }
/* 164 */                           bufferedInputStream.close();
/* 167 */                           Object objM5273b3 = c1486i0.m5273b("sentry:typeCheckHint");
/* 179 */                           if (!InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b3 == null) {
/* 189 */                               AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b3, iLogger);
                                    } else {
/* 185 */                               m5056c(this, file, (InterfaceC1480h) objM5273b3);
                                    }
                                } catch (Throwable th) {
                                    try {
/* 200 */                               bufferedInputStream.close();
                                    } catch (Throwable th2) {
/* 205 */                               th.addSuppressed(th2);
                                    }
/* 208 */                           throw th;
                                }
                            } catch (Throwable th3) {
/* 357 */                       Object objM5273b4 = c1486i0.m5273b("sentry:typeCheckHint");
/* 369 */                       if (!InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b4 == null) {
/* 379 */                           AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b4, iLogger);
                                } else {
/* 375 */                           m5056c(this, file, (InterfaceC1480h) objM5273b4);
                                }
/* 382 */                       throw th3;
                            }
                        } catch (IOException e) {
/* 304 */                   iLogger.mo4670b(EnumC1553m5.ERROR, e, "I/O on file '%s' failed.", file.getAbsolutePath());
/* 307 */                   objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 319 */                   if (InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
                            }
/* 286 */                   AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b, iLogger);
                        }
                    } catch (FileNotFoundException e2) {
/* 336 */               iLogger.mo4670b(EnumC1553m5.ERROR, e2, "File '%s' cannot be found.", file.getAbsolutePath());
/* 339 */               objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 351 */               if (InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
                        }
/* 286 */               AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b, iLogger);
                    } catch (Throwable th4) {
/* 221 */               iLogger.mo4670b(EnumC1553m5.ERROR, th4, "Failed to capture cached envelope %s", file.getAbsolutePath());
/* 224 */               Object objM5273b5 = c1486i0.m5273b("sentry:typeCheckHint");
/* 236 */               if (!InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint")) || objM5273b5 == null) {
/* 261 */                   AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b5, iLogger);
                        } else {
/* 242 */                   ((InterfaceC1480h) objM5273b5).mo4954c(false);
/* 257 */                   iLogger.mo4670b(EnumC1553m5.INFO, th4, "File '%s' won't retry.", file.getAbsolutePath());
                        }
/* 264 */               objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 276 */               if (InterfaceC1480h.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
                        }
/* 286 */               AbstractC1704c.m5458m(InterfaceC1480h.class, objM5273b, iLogger);
                    }
                }
            }
