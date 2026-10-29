.class public final Leg1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lfp1;


# instance fields
.field public final a:La91;

.field public final b:Lx6;

.field public c:I


# direct methods
.method public constructor <init>(La91;Lx6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Leg1;->c:I

    .line 6
    .line 7
    iput-object p1, p0, Leg1;->a:La91;

    .line 8
    .line 9
    iput-object p2, p0, Leg1;->b:Lx6;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, Leg1;->a:La91;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La91;->f(Lfp1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Leg1;->c:I

    .line 2
    .line 3
    iget-object v1, p0, Leg1;->a:La91;

    .line 4
    .line 5
    iget v1, v1, La91;->g:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    iput v1, p0, Leg1;->c:I

    .line 10
    .line 11
    iget-object p0, p0, Leg1;->b:Lx6;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lx6;->q(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
