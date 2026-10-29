.class public final Lww1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lzy2;
.implements Ljw0;
.implements Lxn2;


# instance fields
.field public final a:Lnq1;


# direct methods
.method public constructor <init>(Lnq1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lww1;->a:Lnq1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final k()Lty;
    .locals 0

    .line 1
    iget-object p0, p0, Lww1;->a:Lnq1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l()I
    .locals 1

    .line 1
    sget-object v0, Lhw0;->o:Llf;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lx02;->e(Llf;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
