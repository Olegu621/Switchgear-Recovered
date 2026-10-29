            package io.sentry;

            import io.sentry.vendor.gson.stream.EnumC1731b;
            import java.io.Closeable;
            import java.util.AbstractMap;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.TimeZone;
            
            /* JADX INFO: renamed from: io.sentry.i3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public interface InterfaceC1489i3 extends Closeable {
                /* JADX INFO: renamed from: B */
                Long mo5227B();

                /* JADX INFO: renamed from: G0 */
                Float mo5228G0();

                /* JADX INFO: renamed from: J */
                TimeZone mo5229J(ILogger iLogger);

                /* JADX INFO: renamed from: K0 */
                Object mo5230K0(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1);

                /* JADX INFO: renamed from: M */
                String mo5231M();

                /* JADX INFO: renamed from: R0 */
                Object mo5232R0();

                /* JADX INFO: renamed from: T */
                HashMap mo5233T(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1);

                /* JADX INFO: renamed from: b0 */
                Double mo5234b0();

                void beginArray();

                void beginObject();

                void endArray();

                void endObject();

                /* JADX INFO: renamed from: h1 */
                ArrayList mo5239h1(ILogger iLogger, InterfaceC1696u1 interfaceC1696u1);

                boolean hasNext();

                /* JADX INFO: renamed from: l0 */
                Date mo5241l0(ILogger iLogger);

                double nextDouble();

                float nextFloat();

                int nextInt();

                long nextLong();

                String nextName();

                String nextString();

                EnumC1731b peek();

                /* JADX INFO: renamed from: q0 */
                Boolean mo5242q0();

                /* JADX INFO: renamed from: r */
                Integer mo5243r();

                void setLenient(boolean z);

                void skipValue();

                /* JADX INFO: renamed from: w */
                void mo5244w(ILogger iLogger, AbstractMap abstractMap, String str);
            }
