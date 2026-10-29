            package com.supercell.p007id.scid_plugin;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.lang.ref.WeakReference;
            import java.util.Collection;
            import java.util.concurrent.CancellationException;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import okhttp3.HttpUrl;
            import p000.C0899f;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.e70;
            import p000.f42;
            import p000.g40;
            import p000.gb1;
            import p000.hy1;
            import p000.i13;
            import p000.iy1;
            import p000.j50;
            import p000.jr0;
            import p000.jy1;
            import p000.ky1;
            import p000.ly1;
            import p000.m60;
            import p000.my1;
            import p000.ny1;
            import p000.oy1;
            import p000.pg3;
            import p000.t80;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            import p000.z80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001aO\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\n\u0010\u0007\u001aE\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\n\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001aK\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0010\u0010\u0007\u001aO\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0011\u0010\u0007\u001aE\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u0012\u0010\r\u001aQ\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0007\u001aa\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0007\u001aQ\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0007\u001aa\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0007\u001ae\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u00022\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u00040\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001aa\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u00022\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u001b¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u009f\u0001\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u00022\b\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001f\u0010 \u001aO\u0010\"\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010!\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\"\u0010\u0007\u001aS\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u001a\u0010!\u001a\u0016\u0012\b\u0012\u00060\bj\u0002`\t\u0012\b\u0012\u00060\bj\u0002`\t0\u0003¢\u0006\u0004\b#\u0010\u0007\u001aC\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0002\"\u0004\b\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'\u001aO\u0010*\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u00060(j\u0002`)\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b*\u0010\u0007\u001a2\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000+j\b\u0012\u0004\u0012\u00028\u0000`,2\u0006\u0010-\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b.\u0010/\u001a6\u00101\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000+j\b\u0012\u0004\u0012\u00028\u0000`,2\n\u00100\u001a\u00060\bj\u0002`\tH\u0086\b¢\u0006\u0004\b1\u00102\u001a.\u00103\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010-\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b3\u00104\u001a2\u00106\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u00002\n\u00105\u001a\u00060\bj\u0002`\tH\u0086\b¢\u0006\u0004\b6\u00107\u001a&\u00108\u001a\u0012\u0012\u0004\u0012\u00028\u00000+j\b\u0012\u0004\u0012\u00028\u0000`,\"\u0004\b\u0000\u0010\u0000H\u0086\b¢\u0006\u0004\b8\u00109\u001af\u0010=\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<`\u0002\"\u0004\b\u0000\u0010\u000022\u0010;\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00020:\"\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002H\u0086\b¢\u0006\u0004\b=\u0010>\u001aP\u0010=\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<`\u0002\"\u0004\b\u0000\u0010\u00002\u001c\u0010;\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00020?H\u0086\b¢\u0006\u0004\b=\u0010@\u001at\u0010F\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E`\u0002\"\u0004\b\u0000\u0010A\"\u0004\b\u0001\u0010B2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\b\u0012\u0004\u0012\u00028\u0001`\u0002H\u0086\b¢\u0006\u0004\bF\u0010G\u001a1\u0010H\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\bH\u0010I\u001a%\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0001j\b\u0012\u0004\u0012\u00020\u0004`\u00022\u0006\u0010J\u001a\u00020$¢\u0006\u0004\bK\u0010L\u001a{\u0010S\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\b\u0000\u0010\u00002.\u0010M\u001a*\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00020\u00032\b\b\u0002\u0010O\u001a\u00020N2\b\b\u0002\u0010P\u001a\u00020$2\b\b\u0002\u0010Q\u001a\u00020$2\b\b\u0002\u0010R\u001a\u00020$¢\u0006\u0004\bS\u0010T\"-\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00028F¢\u0006\u0006\u001a\u0004\bU\u0010V*\u001c\u0010W\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001*\u001c\u0010X\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000+2\b\u0012\u0004\u0012\u00028\u00000+*\u000e\u0010Z\"\u0002`Y2\u00060(j\u0002`Y¨\u0006["}, m6176d2 = {"T", "Le70;", "Lcom/supercell/id/scid_plugin/Promise;", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "block", "success", "(Le70;Lkotlin/jvm/functions/Function1;)Le70;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fail", "Lkotlin/Function0;", "always", "(Le70;Lkotlin/jvm/functions/Function0;)Le70;", "subscribe", "(Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "successUi", "failUi", "alwaysUi", "R", "thenUi", "thenAsyncUi", "then", "thenAsync", "C", "V", "context", "Lkotlin/Function2;", "failUiWith", "(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Le70;", "successUiWith", "subscribeUiWith", "(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Le70;", "transform", "mapFail", "thenFail", HttpUrl.FRAGMENT_ENCODE_SET, "timeoutMillis", "nullAfter", "(Le70;J)Le70;", "Ljava/util/concurrent/CancellationException;", "Lcom/supercell/id/scid_plugin/CancelException;", "onCancel", "Ljx;", "Lcom/supercell/id/scid_plugin/DeferredPromise;", FirebaseAnalytics.Param.VALUE, "resolve", "(Ljx;Ljava/lang/Object;)V", "exception", "reject", "(Ljx;Ljava/lang/Exception;)V", "ofSuccess", "(Ljava/lang/Object;)Le70;", "e", "ofFail", "(Ljava/lang/Exception;)Le70;", "deferred", "()Ljx;", HttpUrl.FRAGMENT_ENCODE_SET, "promises", HttpUrl.FRAGMENT_ENCODE_SET, "all", "([Le70;)Le70;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Collection;)Le70;", "T1", "T2", "promise1", "promise2", "Lkotlin/Pair;", "both", "(Le70;Le70;)Le70;", "task", "(Lkotlin/jvm/functions/Function0;)Le70;", "millis", "ofDelay", "(J)Le70;", "attempt", HttpUrl.FRAGMENT_ENCODE_SET, "maxRetries", "initialRetryDelayMillis", "randomRetryDelayMillis", "maxRetryDelayMillis", "withRetries", "(Lkotlin/jvm/functions/Function1;IJJJ)Le70;", "getValue", "(Le70;)Ljava/lang/Object;", "Promise", "DeferredPromise", "Lkotlinx/coroutines/CancellationException;", "CancelException", "scid_plugin_release"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 16 */    public final class PromiseUtilKt {

                /* JADX INFO: renamed from: com.supercell.id.scid_plugin.PromiseUtilKt$all$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"T", "Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)Ljava/util/List;"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "com.supercell.id.scid_plugin.PromiseUtilKt$all$1", m5708f = "PromiseUtil.kt", m5709l = {207}, m5710m = "invokeSuspend")
                public static final class C07781 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ e70[] $promises;
                    int I$0;
                    int I$1;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C07781(e70[] e70VarArr, c10 c10Var) {
/* 4 */                 super(2, c10Var);
/* 1 */                 this.$promises = e70VarArr;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 5 */                 return new C07781(this.$promises, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C07781) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0038  */
                    /* JADX WARN: Code duplicated, block: B:12:0x004c A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:13:0x004d  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004d -> B:14:0x004e). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                        java.lang.StackOverflowError
                        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                        */
                    @Override // p000.AbstractC0181bi
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            z10 r0 = p000.z10.f19902a
                            int r1 = r7.label
                            r2 = 1
                            if (r1 == 0) goto L24
                            if (r1 != r2) goto L1d
                            int r1 = r7.I$1
                            int r3 = r7.I$0
                            java.lang.Object r4 = r7.L$2
                            java.util.Collection r4 = (java.util.Collection) r4
                            java.lang.Object r5 = r7.L$1
                            java.util.Collection r5 = (java.util.Collection) r5
                            java.lang.Object r6 = r7.L$0
                            e70[] r6 = (p000.e70[]) r6
                            p000.pg3.m7417A(r8)
                            goto L4e
                        L1d:
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            p000.f42.m3656l(r7)
                            r7 = 0
                            return r7
                        L24:
                            p000.pg3.m7417A(r8)
                            e70[] r8 = r7.$promises
                            java.util.ArrayList r1 = new java.util.ArrayList
                            int r3 = r8.length
                            r1.<init>(r3)
                            int r3 = r8.length
                            r4 = 0
                            r6 = r4
                            r4 = r1
                            r1 = r3
                            r3 = r6
                            r6 = r8
                        L36:
                            if (r3 >= r1) goto L54
                            r8 = r6[r3]
                            r7.L$0 = r6
                            r7.L$1 = r4
                            r7.L$2 = r4
                            r7.I$0 = r3
                            r7.I$1 = r1
                            r7.label = r2
                            java.lang.Object r8 = r8.await(r7)
                            if (r8 != r0) goto L4d
                            return r0
                        L4d:
                            r5 = r4
                        L4e:
                            r4.add(r8)
                            int r3 = r3 + r2
                            r4 = r5
                            goto L36
                        L54:
                            java.util.List r4 = (java.util.List) r4
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.supercell.p007id.scid_plugin.PromiseUtilKt.C07781.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: com.supercell.id.scid_plugin.PromiseUtilKt$all$2 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m6176d2 = {"T", "Ly10;", HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous>", "(Ly10;)Ljava/util/List;"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "com.supercell.id.scid_plugin.PromiseUtilKt$all$2", m5708f = "PromiseUtil.kt", m5709l = {213}, m5710m = "invokeSuspend")
                public static final class C07792 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ Collection<e70> $promises;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C07792(Collection<? extends e70> collection, c10 c10Var) {
/* 4 */                 super(2, c10Var);
/* 1 */                 this.$promises = collection;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 5 */                 return new C07792(this.$promises, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C07792) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
                    /* JADX WARN: Code duplicated, block: B:13:0x004f A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0050 -> B:15:0x0051). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                        java.lang.StackOverflowError
                        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                        */
                    @Override // p000.AbstractC0181bi
                    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                        /*
                            r5 = this;
                            z10 r0 = p000.z10.f19902a
                            int r1 = r5.label
                            r2 = 1
                            if (r1 == 0) goto L20
                            if (r1 != r2) goto L19
                            java.lang.Object r1 = r5.L$2
                            java.util.Collection r1 = (java.util.Collection) r1
                            java.lang.Object r3 = r5.L$1
                            java.util.Iterator r3 = (java.util.Iterator) r3
                            java.lang.Object r4 = r5.L$0
                            java.util.Collection r4 = (java.util.Collection) r4
                            p000.pg3.m7417A(r6)
                            goto L51
                        L19:
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            p000.f42.m3656l(r5)
                            r5 = 0
                            return r5
                        L20:
                            p000.pg3.m7417A(r6)
                            java.util.Collection<e70> r6 = r5.$promises
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r3 = 10
                            int r3 = p000.C2122qw.m8020h(r6, r3)
                            r1.<init>(r3)
                            java.util.Iterator r6 = r6.iterator()
                            r3 = r6
                        L35:
                            boolean r6 = r3.hasNext()
                            if (r6 == 0) goto L56
                            java.lang.Object r6 = r3.next()
                            e70 r6 = (p000.e70) r6
                            r5.L$0 = r1
                            r5.L$1 = r3
                            r5.L$2 = r1
                            r5.label = r2
                            java.lang.Object r6 = r6.await(r5)
                            if (r6 != r0) goto L50
                            return r0
                        L50:
                            r4 = r1
                        L51:
                            r1.add(r6)
                            r1 = r4
                            goto L35
                        L56:
                            java.util.List r1 = (java.util.List) r1
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.supercell.p007id.scid_plugin.PromiseUtilKt.C07792.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* JADX INFO: renamed from: com.supercell.id.scid_plugin.PromiseUtilKt$both$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m6176d2 = {"T1", "T2", "Ly10;", "Lkotlin/Pair;", "<anonymous>", "(Ly10;)Lkotlin/Pair;"}, m6177k = 3, m6178mv = {2, 1, 0})
                @j50(m5707c = "com.supercell.id.scid_plugin.PromiseUtilKt$both$1", m5708f = "PromiseUtil.kt", m5709l = {219, 219}, m5710m = "invokeSuspend")
                public static final class C07801 extends tj2 implements Function2<y10, c10, Object> {
                    final /* synthetic */ e70 $promise1;
                    final /* synthetic */ e70 $promise2;
                    Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C07801(e70 e70Var, e70 e70Var2, c10 c10Var) {
/* 6 */                 super(2, c10Var);
/* 1 */                 this.$promise1 = e70Var;
/* 3 */                 this.$promise2 = e70Var2;
                    }

                    @Override // p000.AbstractC0181bi
                    public final c10 create(Object obj, c10 c10Var) {
/* 7 */                 return new C07801(this.$promise1, this.$promise2, c10Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(y10 y10Var, c10 c10Var) {
/* 9 */                 return ((C07801) create(y10Var, c10Var)).invokeSuspend(Unit.f12910a);
                    }

                    @Override // p000.AbstractC0181bi
                    public final Object invokeSuspend(Object obj) {
                        Object obj2;
/* 1 */                 z10 z10Var = z10.f19902a;
/* 3 */                 int i = this.label;
/* 7 */                 if (i == 0) {
/* 30 */                    pg3.m7417A(obj);
/* 33 */                    e70 e70Var = this.$promise1;
/* 35 */                    this.label = 1;
/* 37 */                    obj = e70Var.await(this);
/* 41 */                    if (obj != z10Var) {
                            }
/* 56 */                    return z10Var;
                        }
/* 9 */                 if (i == 1) {
/* 26 */                    pg3.m7417A(obj);
                        } else {
/* 11 */                    if (i != 2) {
/* 21 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 24 */                        return null;
                            }
/* 13 */                    obj2 = this.L$0;
/* 15 */                    pg3.m7417A(obj);
                        }
/* 62 */                return new Pair(obj2, obj);
/* 44 */                e70 e70Var2 = this.$promise2;
/* 46 */                this.L$0 = obj;
/* 48 */                this.label = 2;
/* 50 */                Object objAwait = e70Var2.await(this);
/* 54 */                if (objAwait != z10Var) {
/* 57 */                    Object obj3 = obj;
/* 58 */                    obj = objAwait;
/* 59 */                    obj2 = obj3;
/* 62 */                    return new Pair(obj2, obj);
                        }
/* 56 */                return z10Var;
                    }
                }

                public static final <T> e70 all(e70... e70VarArr) {
/* 1 */             e70VarArr.getClass();
/* 13 */            return i13.m4427d(jr0.f12448a, null, new C07781(e70VarArr, null), 3);
                }

                public static final <T> e70 always(e70 e70Var, Function0<Unit> function0) {
/* 1 */             e70Var.getClass();
/* 4 */             function0.getClass();
/* 17 */            i13.m4443w(jr0.f12448a, null, new iy1(e70Var, function0, null, 0), 3);
/* 20 */            return e70Var;
                }

                public static final <T> e70 alwaysUi(e70 e70Var, Function0<Unit> function0) {
/* 1 */             e70Var.getClass();
/* 4 */             function0.getClass();
/* 7 */             m60 m60Var = z80.f19975a;
/* 21 */            i13.m4443w(jr0.f12448a, gb1.f8531a, new iy1(e70Var, function0, null, 1), 2);
/* 24 */            return e70Var;
                }

                public static final <T1, T2> e70 both(e70 e70Var, e70 e70Var2) {
/* 1 */             e70Var.getClass();
/* 4 */             e70Var2.getClass();
/* 16 */            return i13.m4427d(jr0.f12448a, null, new C07801(e70Var, e70Var2, null), 3);
                }

                public static final <T> InterfaceC1809jx deferred() {
/* 3 */             return new C1869kx();
                }

                public static final <T> e70 fail(e70 e70Var, Function1<? super Exception, Unit> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 17 */            i13.m4443w(jr0.f12448a, null, new jy1(0, null, e70Var, function1), 3);
/* 20 */            return e70Var;
                }

                public static final <T> e70 failUi(e70 e70Var, Function1<? super Exception, Unit> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 7 */             m60 m60Var = z80.f19975a;
/* 21 */            i13.m4443w(jr0.f12448a, gb1.f8531a, new jy1(1, null, e70Var, function1), 2);
/* 24 */            return e70Var;
                }

                public static final <C, V> e70 failUiWith(e70 e70Var, C c, Function2<? super C, ? super Exception, Unit> function2) {
/* 1 */             e70Var.getClass();
/* 4 */             function2.getClass();
/* 18 */            return failUi(e70Var, new hy1(new WeakReference(c), function2, 1));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit failUiWith$lambda$1(WeakReference weakReference, Function2 function2, Exception exc) {
/* 1 */             exc.getClass();
/* 4 */             Object obj = weakReference.get();
/* 8 */             if (obj != null) {
/* 10 */                function2.invoke(obj, exc);
                    }
/* 13 */            return Unit.f12910a;
                }

                public static final <T> T getValue(e70 e70Var) {
/* 1 */             e70Var.getClass();
/* 8 */             c10 c10Var = null;
/* 9 */             if (e70Var.isCompleted()) {
/* 17 */                return (T) i13.m4419A(new ky1(e70Var, c10Var, 1));
                    }
/* 8 */             return null;
                }

                public static final <V> e70 mapFail(e70 e70Var, Function1<? super Exception, ? extends V> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 18 */            return i13.m4427d(jr0.f12448a, z80.f19976b, new jy1(2, null, e70Var, function1), 2);
                }

                public static final <V> e70 nullAfter(e70 e70Var, long j) {
/* 1 */             e70Var.getClass();
/* 15 */            return i13.m4427d(jr0.f12448a, z80.f19976b, new ly1(j, e70Var, null), 2);
                }

                public static final e70 ofDelay(long j) {
/* 10 */            return i13.m4427d(jr0.f12448a, null, new my1(j, null), 3);
                }

                public static final <T> e70 ofFail(Exception exc) {
/* 1 */             exc.getClass();
/* 6 */             C1869kx c1869kx = new C1869kx();
/* 9 */             c1869kx.m6289U(exc);
/* 12 */            return c1869kx;
                }

                public static final <T> e70 ofSuccess(T t) {
/* 3 */             C1869kx c1869kx = new C1869kx();
/* 6 */             c1869kx.m10238D(t);
/* 9 */             return c1869kx;
                }

                public static final <V> e70 onCancel(e70 e70Var, Function1<? super CancellationException, Unit> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 13 */            return fail(e70Var, new C0899f(function1, 3));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit onCancel$lambda$4(Function1 function1, Exception exc) {
/* 1 */             exc.getClass();
/* 6 */             if (exc instanceof CancellationException) {
/* 8 */                 function1.invoke(exc);
                    }
/* 11 */            return Unit.f12910a;
                }

                public static final <V> void reject(InterfaceC1809jx interfaceC1809jx, Exception exc) {
/* 1 */             interfaceC1809jx.getClass();
/* 4 */             exc.getClass();
/* 9 */             ((C1869kx) interfaceC1809jx).m6289U(exc);
                }

                public static final <V> void resolve(InterfaceC1809jx interfaceC1809jx, V v) {
/* 1 */             interfaceC1809jx.getClass();
/* 6 */             ((C1869kx) interfaceC1809jx).m10238D(v);
                }

                public static final <T> void subscribe(e70 e70Var, Function1<? super T, Unit> function1, Function1<? super Exception, Unit> function2, Function0<Unit> function0) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 7 */             function2.getClass();
/* 24 */            i13.m4443w(jr0.f12448a, null, new g40(function1, e70Var, function2, function0, null), 3);
                }

                public static /* synthetic */ void subscribe$default(e70 e70Var, Function1 function1, Function1 function2, Function0 function0, int i, Object obj) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 function0 = null;
                    }
/* 6 */             subscribe(e70Var, function1, function2, function0);
                }

                public static final <C, V> e70 subscribeUiWith(e70 e70Var, C c, Function2<? super C, ? super V, Unit> function2, Function2<? super C, ? super Exception, Unit> function3, Function1<? super C, Unit> function1) {
/* 1 */             e70Var.getClass();
/* 6 */             WeakReference weakReference = new WeakReference(c);
/* 9 */             m60 m60Var = z80.f19975a;
/* 26 */            i13.m4443w(jr0.f12448a, gb1.f8531a, new g40(e70Var, weakReference, function2, function3, function1, null), 2);
/* 16 */            return e70Var;
                }

                public static /* synthetic */ e70 subscribeUiWith$default(e70 e70Var, Object obj, Function2 function2, Function2 function3, Function1 function1, int i, Object obj2) {
/* 4 */             if ((i & 2) != 0) {
/* 6 */                 function2 = null;
                    }
/* 9 */             if ((i & 4) != 0) {
/* 11 */                function3 = null;
                    }
/* 14 */            if ((i & 8) != 0) {
/* 16 */                function1 = null;
                    }
/* 17 */            return subscribeUiWith(e70Var, obj, function2, function3, function1);
                }

                public static final <T> e70 success(e70 e70Var, Function1<? super T, Unit> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 17 */            i13.m4443w(jr0.f12448a, null, new ny1(0, null, e70Var, function1), 3);
/* 20 */            return e70Var;
                }

                public static final <T> e70 successUi(e70 e70Var, Function1<? super T, Unit> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 7 */             m60 m60Var = z80.f19975a;
/* 21 */            i13.m4443w(jr0.f12448a, gb1.f8531a, new ny1(1, null, e70Var, function1), 2);
/* 24 */            return e70Var;
                }

                public static final <C, V> e70 successUiWith(e70 e70Var, C c, Function2<? super C, ? super V, Unit> function2) {
/* 1 */             e70Var.getClass();
/* 4 */             function2.getClass();
/* 18 */            return successUi(e70Var, new hy1(new WeakReference(c), function2, 0));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit successUiWith$lambda$3(WeakReference weakReference, Function2 function2, Object obj) {
/* 1 */             Object obj2 = weakReference.get();
/* 5 */             if (obj2 != null) {
/* 7 */                 function2.invoke(obj2, obj);
                    }
/* 10 */            return Unit.f12910a;
                }

                public static final <T> e70 task(Function0<? extends T> function0) {
/* 1 */             function0.getClass();
/* 14 */            return i13.m4427d(jr0.f12448a, null, new t80(function0, null, 1), 3);
                }

                public static final <T, R> e70 then(e70 e70Var, Function1<? super T, ? extends R> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 18 */            return i13.m4427d(jr0.f12448a, z80.f19976b, new ny1(2, null, e70Var, function1), 2);
                }

                public static final <T, R> e70 thenAsync(e70 e70Var, Function1<? super T, ? extends e70> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 19 */            return i13.m4427d(jr0.f12448a, z80.f19976b, new ny1(3, null, e70Var, function1), 2);
                }

                public static final <T, R> e70 thenAsyncUi(e70 e70Var, Function1<? super T, ? extends e70> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 7 */             m60 m60Var = z80.f19975a;
/* 21 */            return i13.m4427d(jr0.f12448a, gb1.f8531a, new ny1(4, null, e70Var, function1), 2);
                }

                public static final <V> e70 thenFail(e70 e70Var, Function1<? super Exception, ? extends Exception> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 19 */            return i13.m4427d(jr0.f12448a, z80.f19976b, new jy1(3, null, e70Var, function1), 2);
                }

                public static final <T, R> e70 thenUi(e70 e70Var, Function1<? super T, ? extends R> function1) {
/* 1 */             e70Var.getClass();
/* 4 */             function1.getClass();
/* 7 */             m60 m60Var = z80.f19975a;
/* 21 */            return i13.m4427d(jr0.f12448a, gb1.f8531a, new ny1(5, null, e70Var, function1), 2);
                }

                public static final <T> e70 withRetries(Function1<? super Exception, ? extends e70> function1, int i, long j, long j2, long j3) {
/* 1 */             function1.getClass();
/* 20 */            return i13.m4427d(jr0.f12448a, null, new oy1(i, j, j3, j2, function1, null), 3);
                }

                public static /* synthetic */ e70 withRetries$default(Function1 function1, int i, long j, long j2, long j3, int i2, Object obj) {
/* 3 */             if ((i2 & 2) != 0) {
/* 5 */                 i = 10;
                    }
/* 9 */             if ((i2 & 4) != 0) {
/* 11 */                j = 100;
                    }
/* 15 */            if ((i2 & 8) != 0) {
/* 17 */                j2 = 1000;
                    }
/* 21 */            if ((i2 & 16) != 0) {
/* 23 */                j3 = 10000;
                    }
/* 25 */            long j4 = j3;
/* 30 */            return withRetries(function1, i, j, j2, j4);
                }

/* 17 */        public static final <T> e70 all(Collection<? extends e70> collection) {
                    collection.getClass();
                    return i13.m4427d(jr0.f12448a, null, new C07792(collection, null), 3);
                }
            }
