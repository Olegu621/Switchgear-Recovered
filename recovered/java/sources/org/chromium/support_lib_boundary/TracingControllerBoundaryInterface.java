            package org.chromium.support_lib_boundary;

            import java.io.OutputStream;
            import java.util.Collection;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface TracingControllerBoundaryInterface {
                boolean isTracing();

                void start(int i, Collection<String> collection, int i2) throws IllegalStateException, IllegalArgumentException;

                boolean stop(OutputStream outputStream, Executor executor);
            }
