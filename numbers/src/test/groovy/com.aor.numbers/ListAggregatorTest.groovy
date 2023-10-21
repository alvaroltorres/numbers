package com.aor.numbers

import spock.lang.Specification

class ListAggregatorTestsp extends Specification{
    def "distinct_bug_8726"(){
        given:
            def deduplicator = Mock(GenericListDeduplicator)
        when:
            def result = deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2))
        then:
            result == null

    }

    def "GenericListDeduplicator"() {
        given:
            def deduplicator = Mock(GenericListDeduplicator)
            deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2)) >> Arrays.asList(1, 2, 4)
        when:
            def result = deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2))
        then:
            result == Arrays.asList(1, 2, 4)
    }

}