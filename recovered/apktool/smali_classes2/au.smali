.class public final Lau;
.super Lj01;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lzt;


# instance fields
.field public final v:Lcu;


# direct methods
.method public constructor <init>(Lcu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ls91;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lau;->v:Lcu;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo01;->o()Lz01;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lau;->v:Lcu;

    .line 6
    .line 7
    check-cast p0, Lz01;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lz01;->j(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo01;->o()Lz01;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lz01;->n(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
