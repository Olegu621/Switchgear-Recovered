.class public final Lxv0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Law0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lxt0;->b:Lxt0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    sget-object v2, Lr32;->c:Lr32;

    .line 9
    .line 10
    new-instance v3, Lq32;

    .line 11
    .line 12
    invoke-direct {v3, v0, v2}, Lq32;-><init>(Lxt0;Lr32;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lnr;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-direct {v0, v2}, Lnr;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sget-object v2, Lzy2;->K:Llf;

    .line 22
    .line 23
    const/4 v4, 0x4

    .line 24
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v0, v0, Lnr;->b:Luk1;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v4}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v2, Ljw0;->q:Llf;

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v2, Ljw0;->A:Llf;

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v2, Law0;->e:Llf;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v1, Lhw0;->p:Llf;

    .line 49
    .line 50
    sget-object v2, Lmb0;->d:Lmb0;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Law0;

    .line 56
    .line 57
    invoke-static {v0}, Lnq1;->d(Lty;)Lnq1;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {v1, v0}, Law0;-><init>(Lnq1;)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Lxv0;->a:Law0;

    .line 65
    .line 66
    return-void
.end method
