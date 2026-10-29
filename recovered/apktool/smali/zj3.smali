.class public final Lzj3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:Landroid/os/Bundle;

.field public final synthetic d:Lcom/google/android/gms/measurement/internal/zzjc;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzjc;Lcom/google/android/gms/measurement/internal/zzr;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p4, p0, Lzj3;->a:I

    .line 2
    .line 3
    packed-switch p4, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lzj3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 10
    .line 11
    iput-object p3, p0, Lzj3;->c:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lzj3;->d:Lcom/google/android/gms/measurement/internal/zzjc;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p2, p0, Lzj3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 23
    .line 24
    iput-object p3, p0, Lzj3;->c:Landroid/os/Bundle;

    .line 25
    .line 26
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lzj3;->d:Lcom/google/android/gms/measurement/internal/zzjc;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lzj3;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lzj3;->c:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-object v2, p0, Lzj3;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 6
    .line 7
    iget-object p0, p0, Lzj3;->d:Lcom/google/android/gms/measurement/internal/zzjc;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 13
    .line 14
    invoke-virtual {v0}, Lmp3;->A()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 18
    .line 19
    invoke-virtual {p0, v1, v2}, Lmp3;->b0(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 25
    .line 26
    invoke-virtual {v0}, Lmp3;->A()V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzjc;->a:Lmp3;

    .line 30
    .line 31
    invoke-virtual {p0, v1, v2}, Lmp3;->b0(Landroid/os/Bundle;Lcom/google/android/gms/measurement/internal/zzr;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
