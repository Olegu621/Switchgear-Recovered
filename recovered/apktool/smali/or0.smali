.class public abstract Lor0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field protected final zaa:Lur0;

.field private final zab:Landroid/content/Context;

.field private final zac:Ljava/lang/String;

.field private final zad:Lh9;

.field private final zae:Lb9;

.field private final zaf:Lw9;

.field private final zag:Landroid/os/Looper;

.field private final zah:I

.field private final zai:Ltr0;

.field private final zaj:Lyg2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {p3, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {p5, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lor0;->zab:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/16 v2, 0x1e

    .line 33
    .line 34
    if-lt v1, v2, :cond_0

    .line 35
    .line 36
    invoke-static {p1}, Lw0;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0, p1}, Lor0;->getApiFallbackAttributionTag(Landroid/content/Context;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :goto_0
    iput-object p1, p0, Lor0;->zac:Ljava/lang/String;

    .line 46
    .line 47
    iput-object p3, p0, Lor0;->zad:Lh9;

    .line 48
    .line 49
    iput-object p4, p0, Lor0;->zae:Lb9;

    .line 50
    .line 51
    iget-object v1, p5, Lnr0;->b:Landroid/os/Looper;

    .line 52
    .line 53
    iput-object v1, p0, Lor0;->zag:Landroid/os/Looper;

    .line 54
    .line 55
    new-instance v1, Lw9;

    .line 56
    .line 57
    invoke-direct {v1, p3, p4, p1}, Lw9;-><init>(Lh9;Lb9;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object v1, p0, Lor0;->zaf:Lw9;

    .line 61
    .line 62
    new-instance p1, Leb3;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Leb3;-><init>(Lor0;)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lor0;->zai:Ltr0;

    .line 68
    .line 69
    invoke-static {v0}, Lur0;->h(Landroid/content/Context;)Lur0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lor0;->zaa:Lur0;

    .line 74
    .line 75
    iget-object p3, p1, Lur0;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    iput p3, p0, Lor0;->zah:I

    .line 82
    .line 83
    iget-object p3, p5, Lnr0;->a:Lxt0;

    .line 84
    .line 85
    iput-object p3, p0, Lor0;->zaj:Lyg2;

    .line 86
    .line 87
    if-eqz p2, :cond_2

    .line 88
    .line 89
    instance-of p3, p2, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 90
    .line 91
    if-nez p3, :cond_2

    .line 92
    .line 93
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object p4

    .line 101
    if-ne p3, p4, :cond_2

    .line 102
    .line 103
    invoke-static {p2}, Lx61;->getFragment(Landroid/app/Activity;)Le71;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    const-string p3, "ConnectionlessLifecycleHelper"

    .line 108
    .line 109
    const-class p4, Lya3;

    .line 110
    .line 111
    invoke-interface {p2, p4, p3}, Le71;->c(Ljava/lang/Class;Ljava/lang/String;)Lx61;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    check-cast p3, Lya3;

    .line 116
    .line 117
    if-nez p3, :cond_1

    .line 118
    .line 119
    new-instance p3, Lya3;

    .line 120
    .line 121
    sget-object p4, Lpr0;->c:Ljava/lang/Object;

    .line 122
    .line 123
    invoke-direct {p3, p2, p1}, Lya3;-><init>(Le71;Lur0;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    iget-object p2, p3, Lya3;->e:Lkd;

    .line 127
    .line 128
    invoke-virtual {p2, v1}, Lkd;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p3}, Lur0;->b(Lya3;)V

    .line 132
    .line 133
    .line 134
    :cond_2
    iget-object p1, p1, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 135
    .line 136
    const/4 p2, 0x7

    .line 137
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh9;Lb9;Lxt0;)V
    .locals 7

    .line 145
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    .line 146
    new-instance v6, Lnr0;

    invoke-direct {v6, p4, v0}, Lnr0;-><init>(Lxt0;Landroid/os/Looper;)V

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    .line 147
    invoke-direct/range {v1 .. v6}, Lor0;-><init>(Landroid/content/Context;Landroid/app/Activity;Lh9;Lb9;Lnr0;)V

    return-void
.end method


# virtual methods
.method public final a(ILgi;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zak()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lor0;->zaa:Lur0;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Ltb3;

    .line 10
    .line 11
    invoke-direct {v1, p1, p2}, Ltb3;-><init>(ILgi;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, v0, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    new-instance p2, Lkb3;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    invoke-direct {p2, v1, p1, p0}, Lkb3;-><init>(Lbc3;ILor0;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public asGoogleApiClient()Ltr0;
    .locals 0

    .line 1
    iget-object p0, p0, Lor0;->zai:Ltr0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(ILum2;)Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lor0;->zaj:Lyg2;

    .line 7
    .line 8
    iget-object v2, p0, Lor0;->zaa:Lur0;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lum2;->zaa()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v2, v0, v3, p0}, Lur0;->g(Lcom/google/android/gms/tasks/TaskCompletionSource;ILor0;)V

    .line 18
    .line 19
    .line 20
    new-instance v3, Lxb3;

    .line 21
    .line 22
    invoke-direct {v3, p1, p2, v0, v1}, Lxb3;-><init>(ILum2;Lcom/google/android/gms/tasks/TaskCompletionSource;Lyg2;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, v2, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    new-instance p2, Lkb3;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-direct {p2, v3, p1, p0}, Lkb3;-><init>(Lbc3;ILor0;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v2, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public createClientSettingsBuilder()Lvv;
    .locals 4

    .line 1
    new-instance v0, Lvv;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lor0;->zae:Lb9;

    .line 7
    .line 8
    instance-of v2, v1, Lz8;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    check-cast v1, Lz8;

    .line 14
    .line 15
    check-cast v1, Lin3;

    .line 16
    .line 17
    iget-object v1, v1, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, v1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->d:Ljava/lang/String;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroid/accounts/Account;

    .line 27
    .line 28
    const-string v2, "com.google"

    .line 29
    .line 30
    invoke-direct {v3, v1, v2}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    iput-object v3, v0, Lvv;->a:Landroid/accounts/Account;

    .line 34
    .line 35
    iget-object v1, p0, Lor0;->zae:Lb9;

    .line 36
    .line 37
    instance-of v2, v1, Lz8;

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    check-cast v1, Lz8;

    .line 42
    .line 43
    check-cast v1, Lin3;

    .line 44
    .line 45
    iget-object v1, v1, Lin3;->c:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 46
    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->D1()Ljava/util/HashSet;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 58
    .line 59
    :goto_1
    iget-object v2, v0, Lvv;->b:Lkd;

    .line 60
    .line 61
    if-nez v2, :cond_4

    .line 62
    .line 63
    new-instance v2, Lkd;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v2, v3}, Lkd;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object v2, v0, Lvv;->b:Lkd;

    .line 70
    .line 71
    :cond_4
    iget-object v2, v0, Lvv;->b:Lkd;

    .line 72
    .line 73
    invoke-virtual {v2, v1}, Lkd;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lor0;->zab:Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iput-object v1, v0, Lvv;->d:Ljava/lang/String;

    .line 87
    .line 88
    iget-object p0, p0, Lor0;->zab:Landroid/content/Context;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    iput-object p0, v0, Lvv;->c:Ljava/lang/String;

    .line 95
    .line 96
    return-object v0
.end method

.method public disconnectService()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lor0;->zaa:Lur0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lza3;

    .line 7
    .line 8
    invoke-virtual {p0}, Lor0;->getApiKey()Lw9;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v1, p0}, Lza3;-><init>(Lw9;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 16
    .line 17
    const/16 v0, 0xe

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 24
    .line 25
    .line 26
    iget-object p0, v1, Lza3;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public doBestEffortWrite(Lum2;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx8;",
            ">(",
            "Lum2;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0, p1}, Lor0;->b(ILum2;)Lcom/google/android/gms/tasks/Task;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public doBestEffortWrite(Lgi;)Lgi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx8;",
            "T:",
            "Lgi;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x2

    .line 7
    invoke-virtual {p0, v0, p1}, Lor0;->a(ILgi;)V

    return-object p1
.end method

.method public doRead(Lum2;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx8;",
            ">(",
            "Lum2;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, Lor0;->b(ILum2;)Lcom/google/android/gms/tasks/Task;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public doRead(Lgi;)Lgi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx8;",
            "T:",
            "Lgi;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0, p1}, Lor0;->a(ILgi;)V

    return-object p1
.end method

.method public doRegisterEventListener(Lp22;Lcy2;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx8;",
            "T:",
            "Lp22;",
            "U:",
            "Lcy2;",
            ">(TT;TU;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkb1;->n(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lp22;->getListenerKey()Lt81;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Listener has already been released."

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcy2;->getListenerKey()Lt81;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, v1}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lp22;->getListenerKey()Lt81;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p2}, Lcy2;->getListenerKey()Lt81;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lde3;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const-string v1, "Listener registration and unregistration methods must be constructed with the same ListenerHolder."

    .line 36
    .line 37
    invoke-static {v1, v0}, Lkb1;->f(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lor0;->zaa:Lur0;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 46
    .line 47
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lp22;->zaa()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v0, v1, v2, p0}, Lur0;->g(Lcom/google/android/gms/tasks/TaskCompletionSource;ILor0;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lwb3;

    .line 58
    .line 59
    new-instance v3, Llb3;

    .line 60
    .line 61
    invoke-direct {v3, p1, p2}, Llb3;-><init>(Lp22;Lcy2;)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, v3, v1}, Lwb3;-><init>(Llb3;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 65
    .line 66
    .line 67
    iget-object p1, v0, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 68
    .line 69
    new-instance p2, Lkb3;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-direct {p2, v2, p1, p0}, Lkb3;-><init>(Lbc3;ILor0;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 79
    .line 80
    const/16 p1, 0x8

    .line 81
    .line 82
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public doRegisterEventListener(Lq22;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx8;",
            ">(",
            "Lq22;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 94
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public doUnregisterEventListener(Lt81;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt81;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 51
    invoke-virtual {p0, p1, v0}, Lor0;->doUnregisterEventListener(Lt81;I)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public doUnregisterEventListener(Lt81;I)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt81;",
            "I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "Listener key cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkb1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lor0;->zaa:Lur0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 12
    .line 13
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, p2, p0}, Lur0;->g(Lcom/google/android/gms/tasks/TaskCompletionSource;ILor0;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Lwb3;

    .line 20
    .line 21
    invoke-direct {p2, p1, v1}, Lwb3;-><init>(Lt81;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, v0, Lur0;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    new-instance v2, Lkb3;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-direct {v2, p2, p1, p0}, Lkb3;-><init>(Lbc3;ILor0;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, v0, Lur0;->n:Lcom/google/android/gms/internal/base/zau;

    .line 36
    .line 37
    const/16 p1, 0xd

    .line 38
    .line 39
    invoke-virtual {p0, p1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public doWrite(Lum2;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation runtime Lcom/google/errorprone/annotations/ResultIgnorabilityUnspecified;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            "A::",
            "Lx8;",
            ">(",
            "Lum2;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "TTResult;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0, p1}, Lor0;->b(ILum2;)Lcom/google/android/gms/tasks/Task;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public doWrite(Lgi;)Lgi;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lx8;",
            "T:",
            "Lgi;",
            ">(TT;)TT;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 7
    invoke-virtual {p0, v0, p1}, Lor0;->a(ILgi;)V

    return-object p1
.end method

.method public getApiFallbackAttributionTag(Landroid/content/Context;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getApiKey()Lw9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw9;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lor0;->zaf:Lw9;

    .line 2
    .line 3
    return-object p0
.end method

.method public getApiOptions()Lb9;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb9;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lor0;->zae:Lb9;

    .line 2
    .line 3
    return-object p0
.end method

.method public getApplicationContext()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lor0;->zab:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContextAttributionTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lor0;->zac:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContextFeatureId()Ljava/lang/String;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lor0;->zac:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLooper()Landroid/os/Looper;
    .locals 0

    .line 1
    iget-object p0, p0, Lor0;->zag:Landroid/os/Looper;

    .line 2
    .line 3
    return-object p0
.end method

.method public registerListener(Ljava/lang/Object;Ljava/lang/String;)Lv81;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<",
            "L:Ljava/lang/Object;",
            ">(T",
            "L;",
            "Ljava/lang/String;",
            ")",
            "Lv81;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lor0;->zag:Landroid/os/Looper;

    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lk50;->d(Landroid/os/Looper;Ljava/lang/Object;Ljava/lang/String;)Lv81;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final zaa()I
    .locals 0

    .line 1
    iget p0, p0, Lor0;->zah:I

    .line 2
    .line 3
    return p0
.end method

.method public final zab(Landroid/os/Looper;Lcb3;)Ld9;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lor0;->createClientSettingsBuilder()Lvv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lwv;

    .line 6
    .line 7
    iget-object v2, v0, Lvv;->a:Landroid/accounts/Account;

    .line 8
    .line 9
    iget-object v3, v0, Lvv;->b:Lkd;

    .line 10
    .line 11
    iget-object v5, v0, Lvv;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v0, Lvv;->d:Ljava/lang/String;

    .line 14
    .line 15
    sget-object v7, Lje2;->a:Lje2;

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct/range {v1 .. v7}, Lwv;-><init>(Landroid/accounts/Account;Ljava/util/Set;Lid;Ljava/lang/String;Ljava/lang/String;Lje2;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lor0;->zad:Lh9;

    .line 22
    .line 23
    iget-object v0, v0, Lh9;->a:Lw8;

    .line 24
    .line 25
    invoke-static {v0}, Lkb1;->n(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v5, p0, Lor0;->zae:Lb9;

    .line 29
    .line 30
    iget-object v2, p0, Lor0;->zab:Landroid/content/Context;

    .line 31
    .line 32
    move-object v7, p2

    .line 33
    move-object v3, p1

    .line 34
    move-object v6, p2

    .line 35
    move-object v4, v1

    .line 36
    move-object v1, v0

    .line 37
    invoke-virtual/range {v1 .. v7}, Lw8;->buildClient(Landroid/content/Context;Landroid/os/Looper;Lwv;Ljava/lang/Object;Lrr0;Lsr0;)Ld9;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0}, Lor0;->getContextAttributionTag()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    instance-of p2, p1, Lcom/google/android/gms/common/internal/a;

    .line 48
    .line 49
    if-eqz p2, :cond_0

    .line 50
    .line 51
    move-object p2, p1

    .line 52
    check-cast p2, Lcom/google/android/gms/common/internal/a;

    .line 53
    .line 54
    invoke-virtual {p2, p0}, Lcom/google/android/gms/common/internal/a;->setAttributionTag(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    if-eqz p0, :cond_2

    .line 58
    .line 59
    instance-of p0, p1, Lsn1;

    .line 60
    .line 61
    if-nez p0, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {p1}, Lpm2;->m(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    throw p0

    .line 69
    :cond_2
    :goto_0
    return-object p1
.end method

.method public final zac(Landroid/content/Context;Landroid/os/Handler;)Lcom/google/android/gms/common/api/internal/zact;
    .locals 8

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/internal/zact;

    .line 2
    .line 3
    invoke-virtual {p0}, Lor0;->createClientSettingsBuilder()Lvv;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v1, Lwv;

    .line 8
    .line 9
    iget-object v2, p0, Lvv;->a:Landroid/accounts/Account;

    .line 10
    .line 11
    iget-object v3, p0, Lvv;->b:Lkd;

    .line 12
    .line 13
    iget-object v5, p0, Lvv;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v6, p0, Lvv;->d:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v7, Lje2;->a:Lje2;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct/range {v1 .. v7}, Lwv;-><init>(Landroid/accounts/Account;Ljava/util/Set;Lid;Ljava/lang/String;Ljava/lang/String;Lje2;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p1, p2, v1}, Lcom/google/android/gms/common/api/internal/zact;-><init>(Landroid/content/Context;Landroid/os/Handler;Lwv;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
