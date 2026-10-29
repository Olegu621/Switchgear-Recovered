.class public final Lqk1;
.super Lm20;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    sget-object v0, Ll20;->b:Ll20;

    invoke-direct {p0, v0}, Lqk1;-><init>(Lm20;)V

    return-void
.end method

.method public constructor <init>(Lm20;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lm20;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lm20;->a:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    iget-object p1, p1, Lm20;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
