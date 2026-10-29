.class final Lcom/google/android/gms/internal/drive/zzbg;
.super Lum2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lum2;"
    }
.end annotation


# instance fields
.field private final synthetic zzer:Lg20;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzbb;Lg20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lum2;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final synthetic doExecute(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/drive/zzaw;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/a;->getService()Landroid/os/IInterface;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/gms/internal/drive/zzeo;

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    throw p0
.end method
