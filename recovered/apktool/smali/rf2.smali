.class public final Lrf2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/util/TreeSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v0, v0, [Ljava/lang/Comparable;

    .line 6
    .line 7
    new-instance v1, Ljava/util/TreeSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lqd;->l([Ljava/lang/Object;Ljava/util/AbstractSet;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lrf2;->a:Ljava/util/TreeSet;

    .line 16
    .line 17
    return-void
.end method
