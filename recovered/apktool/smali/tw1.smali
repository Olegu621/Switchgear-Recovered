.class public final Ltw1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lww1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxt0;->b:Lxt0;

    .line 2
    .line 3
    sget-object v1, Lr32;->c:Lr32;

    .line 4
    .line 5
    new-instance v2, Lq32;

    .line 6
    .line 7
    invoke-direct {v2, v0, v1}, Lq32;-><init>(Lxt0;Lr32;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lnr;

    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-direct {v0, v1}, Lnr;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Lzy2;->K:Llf;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v0, v0, Lnr;->b:Luk1;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v1, Ljw0;->q:Llf;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v0, v1, v3}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v1, Ljw0;->A:Llf;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lhw0;->p:Llf;

    .line 44
    .line 45
    sget-object v2, Lmb0;->c:Lmb0;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Luk1;->p(Llf;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lww1;

    .line 51
    .line 52
    invoke-static {v0}, Lnq1;->d(Lty;)Lnq1;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-direct {v1, v0}, Lww1;-><init>(Lnq1;)V

    .line 57
    .line 58
    .line 59
    sput-object v1, Ltw1;->a:Lww1;

    .line 60
    .line 61
    return-void
.end method
