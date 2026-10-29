.class public final Lbd3;
.super Lcom/google/android/gms/games/internal/zza;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Lnd3;


# direct methods
.method public synthetic constructor <init>(Lnd3;Lcom/google/android/gms/tasks/TaskCompletionSource;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbd3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lbd3;->c:Lnd3;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/zza;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lbd3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public H(Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 6

    .line 1
    iget v0, p0, Lbd3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-class v0, Ljava/lang/Throwable;

    .line 8
    .line 9
    iget v1, p2, Lcom/google/android/gms/common/data/DataHolder;->e:I

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    :goto_0
    const/16 v4, 0x2713

    .line 19
    .line 20
    iget-object v5, p0, Lbd3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 21
    .line 22
    if-ne v1, v4, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lbd3;->c:Lnd3;

    .line 25
    .line 26
    invoke-static {p0, v5}, Lnd3;->d(Lnd3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 33
    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {v1, v5}, Ljb1;->H(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_3
    :goto_1
    new-instance p0, Lx51;

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lx51;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 54
    .line 55
    .line 56
    :try_start_0
    invoke-virtual {p0}, Lx51;->getCount()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-lez p1, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Lx51;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lw51;

    .line 67
    .line 68
    invoke-interface {p1}, Lun0;->freeze()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :catchall_0
    move-exception p1

    .line 73
    goto :goto_4

    .line 74
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lj;->release()V

    .line 75
    .line 76
    .line 77
    new-instance p0, Ld1;

    .line 78
    .line 79
    new-instance p1, Lg61;

    .line 80
    .line 81
    new-instance v0, Lb61;

    .line 82
    .line 83
    invoke-direct {v0, p2}, Lb61;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p1, v0}, Lg61;-><init>(Lb61;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, Ld1;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_3
    return-void

    .line 96
    :goto_4
    :try_start_1
    invoke-virtual {p0}, Lj;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    .line 99
    goto :goto_5

    .line 100
    :catchall_1
    move-exception p0

    .line 101
    :try_start_2
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    const-string v1, "addSuppressed"

    .line 106
    .line 107
    invoke-virtual {v0, v1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {p2, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    .line 117
    .line 118
    :catch_0
    :goto_5
    throw p1

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public X(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 1

    .line 1
    iget v0, p0, Lbd3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    invoke-virtual {p0, p1}, Lbd3;->l(Lcom/google/android/gms/common/data/DataHolder;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 6

    .line 1
    iget v0, p0, Lbd3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    const-class v0, Ljava/lang/Throwable;

    .line 8
    .line 9
    iget v1, p1, Lcom/google/android/gms/common/data/DataHolder;->e:I

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x0

    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    :goto_0
    const/16 v4, 0x2713

    .line 19
    .line 20
    iget-object v5, p0, Lbd3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 21
    .line 22
    if-ne v1, v4, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lbd3;->c:Lnd3;

    .line 25
    .line 26
    invoke-static {p0, v5}, Lnd3;->d(Lnd3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 30
    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    if-eqz v1, :cond_3

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-static {v1, v5}, Ljb1;->H(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    :goto_1
    iget-object p0, p1, Lcom/google/android/gms/common/data/DataHolder;->f:Landroid/os/Bundle;

    .line 46
    .line 47
    if-nez p0, :cond_4

    .line 48
    .line 49
    new-instance p0, Landroid/os/Bundle;

    .line 50
    .line 51
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 52
    .line 53
    .line 54
    :cond_4
    :try_start_0
    iget p0, p1, Lcom/google/android/gms/common/data/DataHolder;->v:I

    .line 55
    .line 56
    if-lez p0, :cond_5

    .line 57
    .line 58
    new-instance p0, Ld61;

    .line 59
    .line 60
    invoke-direct {p0, p1, v3}, Ld61;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 61
    .line 62
    .line 63
    new-instance v1, Lc61;

    .line 64
    .line 65
    invoke-direct {v1, p0}, Lc61;-><init>(Ld61;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/4 v1, 0x0

    .line 72
    :goto_2
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 73
    .line 74
    .line 75
    new-instance p0, Ld1;

    .line 76
    .line 77
    invoke-direct {p0, v1}, Ld1;-><init>(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :goto_3
    return-void

    .line 84
    :goto_4
    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 85
    .line 86
    .line 87
    goto :goto_5

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    :try_start_2
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    const-string v2, "addSuppressed"

    .line 94
    .line 95
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 104
    .line 105
    .line 106
    :catch_0
    :goto_5
    throw p0

    .line 107
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public l(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 3

    .line 1
    iget v0, p0, Lbd3;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget v0, p1, Lcom/google/android/gms/common/data/DataHolder;->e:I

    .line 8
    .line 9
    const/16 v1, 0x2713

    .line 10
    .line 11
    iget-object v2, p0, Lbd3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lbd3;->c:Lnd3;

    .line 16
    .line 17
    invoke-static {p0, v2}, Lnd3;->d(Lnd3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 p0, 0x3

    .line 25
    if-ne v0, p0, :cond_1

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    invoke-static {v0, v2}, Ljb1;->H(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->close()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    new-instance p0, Ld1;

    .line 42
    .line 43
    new-instance v0, Lr1;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, p1, v1}, Lr1;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v0}, Ld1;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_1
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
