.class public final Lw93;
.super Lra3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic i:Landroid/os/IBinder;

.field public final synthetic v:Ly93;


# direct methods
.method public constructor <init>(Ly93;Landroid/os/IBinder;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lw93;->i:Landroid/os/IBinder;

    .line 2
    .line 3
    iput-object p1, p0, Lw93;->v:Ly93;

    .line 4
    .line 5
    invoke-direct {p0}, Lra3;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw93;->v:Ly93;

    .line 2
    .line 3
    iget-object v0, v0, Ly93;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lz93;

    .line 6
    .line 7
    iget-object v1, v0, Lz93;->i:Lua3;

    .line 8
    .line 9
    iget-object p0, p0, Lw93;->i:Landroid/os/IBinder;

    .line 10
    .line 11
    invoke-interface {v1, p0}, Lua3;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroid/os/IInterface;

    .line 16
    .line 17
    iput-object p0, v0, Lz93;->n:Landroid/os/IInterface;

    .line 18
    .line 19
    iget-object p0, v0, Lz93;->b:Lqa3;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    new-array v2, v1, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string v3, "linkToDeath"

    .line 25
    .line 26
    invoke-virtual {p0, v3, v2}, Lqa3;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    iget-object v2, v0, Lz93;->n:Landroid/os/IInterface;

    .line 30
    .line 31
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, v0, Lz93;->k:Lsa3;

    .line 36
    .line 37
    invoke-interface {v2, v3, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catch_0
    move-exception v2

    .line 42
    new-array v3, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v4, "linkToDeath failed"

    .line 45
    .line 46
    invoke-virtual {p0, v2, v4, v3}, Lqa3;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iput-boolean v1, v0, Lz93;->g:Z

    .line 50
    .line 51
    iget-object p0, v0, Lz93;->d:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    iget-object p0, v0, Lz93;->d:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 76
    .line 77
    .line 78
    return-void
.end method
