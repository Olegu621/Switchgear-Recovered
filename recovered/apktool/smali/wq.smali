.class public final Lwq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lyy2;


# instance fields
.field public final a:Luk1;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 94
    invoke-static {}, Luk1;->j()Luk1;

    move-result-object v0

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput-object v0, p0, Lwq;->a:Luk1;

    .line 97
    sget-object v1, Lrm2;->E:Llf;

    const/4 v2, 0x0

    .line 98
    :try_start_0
    invoke-virtual {v0, v1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v2

    .line 99
    :goto_0
    check-cast v0, Ljava/lang/Class;

    .line 100
    const-class v1, Lvq;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 101
    :cond_0
    const-string v1, "Invalid target class configuration for "

    const-string v3, ": "

    invoke-static {v1, p0, v3, v0}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v2

    .line 102
    :cond_1
    :goto_1
    iget-object p0, p0, Lwq;->a:Luk1;

    .line 103
    sget-object v0, Lrm2;->E:Llf;

    invoke-virtual {p0, v0, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 104
    sget-object v0, Lrm2;->D:Llf;

    .line 105
    :try_start_1
    invoke-virtual {p0, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    if-nez v2, :cond_2

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 107
    sget-object v1, Lrm2;->D:Llf;

    invoke-virtual {p0, v1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Luk1;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwq;->a:Luk1;

    .line 5
    .line 6
    sget-object v0, Lrm2;->E:Llf;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p1, v0}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-object p1, v1

    .line 15
    :goto_0
    check-cast p1, Ljava/lang/Class;

    .line 16
    .line 17
    const-class v0, Llh2;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-string v0, "Invalid target class configuration for "

    .line 29
    .line 30
    const-string v2, ": "

    .line 31
    .line 32
    invoke-static {v0, p0, v2, p1}, Lds0;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    throw v1

    .line 36
    :cond_1
    :goto_1
    iget-object p1, p0, Lwq;->a:Luk1;

    .line 37
    .line 38
    sget-object v2, Lzy2;->O:Llf;

    .line 39
    .line 40
    sget-object v3, Lbz2;->e:Lbz2;

    .line 41
    .line 42
    invoke-virtual {p1, v2, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p0, p0, Lwq;->a:Luk1;

    .line 46
    .line 47
    sget-object p1, Lrm2;->E:Llf;

    .line 48
    .line 49
    invoke-virtual {p0, p1, v0}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, Lrm2;->D:Llf;

    .line 53
    .line 54
    :try_start_1
    invoke-virtual {p0, p1}, Lnq1;->e(Llf;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 58
    :catch_1
    if-nez v1, :cond_2

    .line 59
    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v0, "-"

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    sget-object v0, Lrm2;->D:Llf;

    .line 89
    .line 90
    invoke-virtual {p0, v0, p1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
.end method


# virtual methods
.method public m()Luk1;
    .locals 0

    .line 1
    iget-object p0, p0, Lwq;->a:Luk1;

    .line 2
    .line 3
    return-object p0
.end method

.method public o()Lzy2;
    .locals 1

    .line 1
    new-instance v0, Lmh2;

    .line 2
    .line 3
    iget-object p0, p0, Lwq;->a:Luk1;

    .line 4
    .line 5
    invoke-static {p0}, Lnq1;->d(Lty;)Lnq1;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lmh2;-><init>(Lnq1;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
