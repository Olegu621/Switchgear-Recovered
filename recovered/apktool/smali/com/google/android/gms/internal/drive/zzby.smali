.class abstract Lcom/google/android/gms/internal/drive/zzby;
.super Lcom/google/android/gms/internal/drive/zzau;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/drive/zzau<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ltr0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzau;-><init>(Ltr0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public synthetic createFailedResult(Lcom/google/android/gms/common/api/Status;)Lp42;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/android/gms/internal/drive/zzbx;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/drive/zzbx;-><init>(Lcom/google/android/gms/common/api/Status;Lja0;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method
