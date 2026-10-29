.class public Lxhpgvfjuz/aq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/display/DisplayManager$DisplayListener;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lxhpgvfjuz/aq;

    const v1, 0x63c9

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native a(I)V
.end method

.method public static native b(I)V
.end method

.method public static native c(I)V
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 0

    invoke-static {p1}, Lxhpgvfjuz/aq;->c(I)V

    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 0

    invoke-static {p1}, Lxhpgvfjuz/aq;->b(I)V

    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 0

    invoke-static {p1}, Lxhpgvfjuz/aq;->a(I)V

    return-void
.end method
