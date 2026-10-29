.class final Lcom/google/android/gms/internal/drive/zzcv;
.super Lcy2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcy2;"
    }
.end annotation


# instance fields
.field private final synthetic zzfu:Lcom/google/android/gms/internal/drive/zzg;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/drive/zzch;Lt81;Lcom/google/android/gms/internal/drive/zzg;)V
    .locals 0

    .line 1
    iput-object p3, p0, Lcom/google/android/gms/internal/drive/zzcv;->zzfu:Lcom/google/android/gms/internal/drive/zzg;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcy2;-><init>(Lt81;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final synthetic unregisterListener(Lx8;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzcv;->zzfu:Lcom/google/android/gms/internal/drive/zzg;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/drive/zzg;->cancel()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
