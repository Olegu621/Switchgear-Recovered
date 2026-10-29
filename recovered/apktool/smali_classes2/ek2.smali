.class public final synthetic Lek2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgk2;


# direct methods
.method public synthetic constructor <init>(Lgk2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lek2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lek2;->b:Lgk2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lek2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lek2;->b:Lgk2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lgk2;->l()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 12
    .line 13
    const-string v1, "Need to call openCaptureSession before using this API."

    .line 14
    .line 15
    invoke-static {v0, v1}, Lde3;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lgk2;->b:Lqi1;

    .line 19
    .line 20
    iget-object v1, v0, Lqi1;->b:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v1

    .line 23
    :try_start_0
    iget-object v0, v0, Lqi1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    iget-object v0, p0, Lgk2;->g:Lgr0;

    .line 32
    .line 33
    iget-object v0, v0, Lgr0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lcb;

    .line 36
    .line 37
    iget-object v0, v0, Lcb;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Landroid/hardware/camera2/CameraCaptureSession;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/hardware/camera2/CameraCaptureSession;->close()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lgk2;->d:Ly92;

    .line 45
    .line 46
    new-instance v1, Lek2;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v1, p0, v2}, Lek2;-><init>(Lgk2;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ly92;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception p0

    .line 57
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p0

    .line 59
    :pswitch_0
    invoke-virtual {p0, p0}, Lgk2;->g(Lgk2;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
