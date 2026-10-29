            package com.supercell.p007id.scid_plugin;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m6176d2 = {"parcelableCreator", "Landroid/os/Parcelable$Creator;", "T", "create", "Lkotlin/Function1;", "Landroid/os/Parcel;", "scid_plugin_release"}, m6177k = 2, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class IdAccountKt {

                /* JADX INFO: Add missing generic type declarations: [T] */
                /* JADX INFO: renamed from: com.supercell.id.scid_plugin.IdAccountKt$parcelableCreator$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0015\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\u0005J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m6176d2 = {"com/supercell/id/scid_plugin/IdAccountKt$parcelableCreator$1", "Landroid/os/Parcelable$Creator;", "createFromParcel", FirebaseAnalytics.Param.SOURCE, "Landroid/os/Parcel;", "(Landroid/os/Parcel;)Ljava/lang/Object;", "newArray", HttpUrl.FRAGMENT_ENCODE_SET, "size", HttpUrl.FRAGMENT_ENCODE_SET, "(I)[Ljava/lang/Object;", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 176)
                public static final class C07751<T> implements Parcelable.Creator<T> {
                    final /* synthetic */ Function1<Parcel, T> $create;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C07751(Function1<? super Parcel, ? extends T> function1) {
/* 1 */                 this.$create = function1;
                    }

                    @Override // android.os.Parcelable.Creator
                    public T createFromParcel(Parcel source) {
/* 1 */                 source.getClass();
/* 6 */                 return (T) this.$create.invoke(source);
                    }

                    @Override // android.os.Parcelable.Creator
                    public T[] newArray(int size) {
/* 8 */                 throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
                    }
                }

                public static final <T> Parcelable.Creator<T> parcelableCreator(Function1<? super Parcel, ? extends T> function1) {
/* 1 */             function1.getClass();
/* 11 */            throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
                }
            }
