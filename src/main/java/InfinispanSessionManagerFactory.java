public class InfinispanSessionManagerFactory {

    private <L> SessionFactory<?, ?, L> createSessionFactory() {
        return new InfinispanSessionFactory<>(this.createSessionAttributesFactory());
    }

    private <L> SessionAttributesFactory<?> createSessionAttributesFactory() {
        return null;
    }
}
